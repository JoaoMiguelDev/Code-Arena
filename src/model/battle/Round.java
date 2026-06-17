package model.battle;

import model.question.*;
import model.character.Character;
import model.character.*;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private int RoundNumber;
    private Question RoundQuestion;
    private Character Player;
    private Enemy Enemy;
    private boolean PlayerWasCorrect;
    private BotAnswerer botAnswerer;
    private char eliminatedOption = 0;


    public static class RoundResult {
        public final boolean correct;
        public final int damageDealt;
        public final List<String> logs;

        public RoundResult(boolean correct, int damageDealt, List<String> logs) {
            this.correct = correct;
            this.damageDealt = damageDealt;
            this.logs = logs;
        }
    }

    public Round(int roundNumber, Question roundQuestion, Character player, Enemy enemy) {
        this.RoundNumber = roundNumber;
        this.RoundQuestion = roundQuestion;
        this.Player = player;
        this.Enemy = enemy;
        this.botAnswerer = new BotAnswerer();
    }




    public void preparePlayerTurn() {
        eliminatedOption = 0;
        if (Player instanceof SpecialAbility sa) {
            sa.onBeforeAnswer(this);
        }
        if (Player instanceof SpecialAbility && RoundQuestion instanceof MultipleChoiceQuestion mcq) {
            eliminatedOption = mcq.getIncorrectOption();
        }
    }


    public char getEliminatedOption() {
        return eliminatedOption;
    }


    public RoundResult executePlayerTurn(String answer) {
        List<String> logs = new ArrayList<>();
        PlayerWasCorrect = RoundQuestion.CheckAnswer(answer);
        int damage = 0;

        if (PlayerWasCorrect) {
            damage = CalculateBaseDamage(Player);
            int net = Enemy.TakeDamage(damage);
            logs.add("✅ Resposta CORRETA! Resposta: " + RoundQuestion.getCorrectAnswer());
            logs.add("⚔️ Dano líquido causado ao " + Enemy.getName() + ": " + net);
        } else {
            logs.add("❌ Resposta INCORRETA! Correta era: " + RoundQuestion.getCorrectAnswer());
        }


        if (Player instanceof SpecialAbility sa) {
            int healthBefore = Player.getHealth();
            sa.onAfterAnswer(this, PlayerWasCorrect);
            int healthAfter = Player.getHealth();


            if (healthAfter > healthBefore) {
                logs.add("🩸 [" + Player.getName() + "] Recuperou " + (healthAfter - healthBefore) + " HP.");
            }

            if (!PlayerWasCorrect && Player instanceof Fool) {
                int pityDamage = Player.getDamage() / 2;
                logs.add("[Bobo] Palpite confuso! Dano de consolação: " + pityDamage);
            }
        }

        return new RoundResult(PlayerWasCorrect, damage, logs);
    }


    public RoundResult executeBotTurn() {
        List<String> logs = new ArrayList<>();
        logs.add("🤖 " + Enemy.getName() + " está processando a resposta...");

        if (botAnswerer.getBotAnswer(RoundQuestion, Enemy)) {
            int baseDamage = CalculateBaseDamage(Enemy);


            if (Player instanceof Fool) {
                baseDamage *= 2;
                logs.add("[Bobo] O Bobo se atrapalhou e o dano foi duplicado!");
            }

            int net = Player.TakeDamage(baseDamage);
            logs.add("💥 " + Enemy.getName() + " acertou e causou " + net + " de dano líquido.");
            return new RoundResult(true, net, logs);
        } else {
            logs.add("✅ " + Enemy.getName() + " errou a resposta!");
            return new RoundResult(false, 0, logs);
        }
    }

    private int CalculateBaseDamage(Character character) {
        return character.getDamage() * RoundQuestion.getDifficulty().getBaseDamage();
    }

    public Character getEnemy() { return this.Enemy; }
    public Question getRoundQuestion() { return this.RoundQuestion; }
    public boolean wasPlayerCorrect() { return PlayerWasCorrect; }
}