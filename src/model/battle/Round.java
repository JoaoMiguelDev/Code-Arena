package model.battle;

import model.question.*;
import model.character.Character;
import model.character.*;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private int roundNumber;
    private Question roundQuestion;
    private Character player;
    private Enemy enemy;
    private boolean playerWasCorrect;
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
        this.roundNumber = roundNumber;
        this.roundQuestion = roundQuestion;
        this.player = player;
        this.enemy = enemy;
        this.botAnswerer = new BotAnswerer();
    }

    public void preparePlayerTurn() {
        eliminatedOption = 0;
        if (player instanceof SpecialAbility sa) {
            sa.onBeforeAnswer(this);
        }
    }


    public char getEliminatedOption() {return eliminatedOption; }
    public void setEliminatedOption(char option) { this.eliminatedOption = option;}


    public RoundResult executePlayerTurn(String answer) {
        List<String> logs = new ArrayList<>();
        playerWasCorrect = roundQuestion.checkAnswer(answer);
        int damage = 0;

        if (playerWasCorrect) {
            damage = CalculateBaseDamage(player);
            int net = enemy.takeDamage(damage);
            logs.add("✅ Resposta CORRETA! Resposta: " + roundQuestion.getCorrectAnswer());
            logs.add("⚔️ Dano líquido causado ao " + enemy.getName() + ": " + net);
        } else {
            logs.add("❌ Resposta INCORRETA! Correta era: " + roundQuestion.getCorrectAnswer());
        }


        if (player instanceof SpecialAbility sa) {
            int healthBefore = player.getHealth();
            sa.onAfterAnswer(this, playerWasCorrect);
            int healthAfter = player.getHealth();


            if (healthAfter > healthBefore) {
                logs.add("🩸 [" + player.getName() + "] Recuperou " + (healthAfter - healthBefore) + " HP.");
            }

            int enemyHealthBefore = enemy.getHealth();
            sa.onAfterAnswer(this, playerWasCorrect);
            int enemyHealthAfter = enemy.getHealth();
            if (!playerWasCorrect && enemyHealthAfter < enemyHealthBefore) {
                logs.add("[" + player.getName() + "] Palpite confuso! ...");
            }
        }

        return new RoundResult(playerWasCorrect, damage, logs);
    }


    public RoundResult executeBotTurn() {
        List<String> logs = new ArrayList<>();
        logs.add("🤖 " + enemy.getName() + " está processando a resposta...");

        if (botAnswerer.getBotAnswer(roundQuestion, enemy)) {
            int baseDamage = CalculateBaseDamage(enemy);

            if (player instanceof SpecialAbility sa) {
                baseDamage = sa.modifyIncomingDamage(baseDamage);
            }

            int net = player.takeDamage(baseDamage);
            logs.add("💥 " + enemy.getName() + " acertou e causou " + net + " de dano líquido.");
            return new RoundResult(true, net, logs);
        } else {
            logs.add("✅ " + enemy.getName() + " errou a resposta!");
            return new RoundResult(false, 0, logs);
        }
    }

    private int CalculateBaseDamage(Character character) {
        return character.getDamage() * roundQuestion.getDifficulty().getBaseDamage();
    }

    public Character getEnemy() { return this.enemy; }
    public Question getRoundQuestion() { return this.roundQuestion; }
}