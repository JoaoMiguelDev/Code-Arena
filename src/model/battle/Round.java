package model.battle;


import model.question.*;
import model.character.Character;
import model.character.*;

import java.util.Scanner;

public class Round {
    private int RoundNumber;
    private Question RoundQuestion;
    private Character Player;
    private Character Enemy;
    private String PlayerAnswer;
    private boolean PlayerAnswered = false;
    private boolean PlayerWasCorrect;
    private BotAnswerer botAnswerer;

    public Round(int roundNumber, Question roundQuestion, Character player, Character enemy){
        this.RoundNumber = roundNumber;
        this.RoundQuestion = roundQuestion;
        this.Player = player;
        this.Enemy = enemy;
        this.botAnswerer = new BotAnswerer();
    }

    public boolean ExecuteRound(Scanner scanner){
        DisplayInfo();
        RoundQuestion.DisplayQuestion();
        HandleTurn(SpeedCheck(), scanner);

        return PlayerWasCorrect;
    }

    private void DisplayInfo(){
        System.out.println("\n" + "=".repeat(50));
        System.out.println("RODADA " + RoundNumber);
        System.out.println("Dificuldade da questão: " + RoundQuestion.getDifficulty());
        System.out.println("=".repeat(50));

        System.out.println("VOCÊ: " + Player.getName() + "          Inimigo: " + Enemy.getName());
        System.out.println("Vida: " + Player.getHealth() + "            Vida: " + Enemy.getHealth());

        System.out.println("=".repeat(50));
    }
    
    private boolean SpeedCheck(){
        if(Player.getSpeed() > Enemy.getSpeed()){
            return true;
        } else if (Player.getSpeed() == Enemy.getSpeed()) {
            return Math.random() < 0.5;
        } else {
            return false;
        }
    }

    private void HandleTurn(boolean playerMoveFirst, Scanner scanner){
        if(playerMoveFirst){
            PlayerTurn(scanner);

            // Critério de parada: Se o inimigo morreu com o golpe do Player, o turno acaba!
            if (!Enemy.IsAlive()) {
                return;
            }

            BotTurn();
        } else {
            BotTurn();

            // Critério de parada: Se o bot matou o Player, o jogador não joga!
            if (!Player.IsAlive()) {
                return;
            }

            PlayerTurn(scanner);
        }
    }

    private void PlayerTurn(Scanner scanner){
        System.out.println("\n" + "─".repeat(50));
        System.out.println("SEU TURNO");
        System.out.println("=".repeat(50));

        if (Player instanceof FortuneTeller && !(RoundQuestion instanceof TrueFalseQuestion)) {
            FortuneTeller fortuneTeller = (FortuneTeller) Player;
            fortuneTeller.setAbilityUsedThisRound(false); // Reseta o estado no início do turno

            System.out.println("[Cartomante] Deseja usar sua habilidade 'Visão do Futuro' para eliminar uma alternativa?");
            System.out.print("(S/N): ");
            String useAbility = scanner.nextLine().trim().toUpperCase();

            if (useAbility.equals("S")) {
                MultipleChoiceQuestion mcq = (MultipleChoiceQuestion) RoundQuestion;
                char incorrectLetter = mcq.getIncorrectOption();
                fortuneTeller.activateAbility(this);

                System.out.println("👉 Dica: A alternativa" + incorrectLetter + "está incorreta!");
            }
        }

        long startTime = System.currentTimeMillis();

        System.out.println("Escolha uma resposta:");
        PlayerAnswer = scanner.nextLine().trim();

        long endTime = System.currentTimeMillis();
        long elapsedSeconds = (endTime - startTime) / 1000;

        if (RoundQuestion instanceof TimedQuestion) {
            TimedQuestion timed = (TimedQuestion) RoundQuestion;
            System.out.println("Tempo de resposta: " + elapsedSeconds + "s / Limite: " + timed.getTimeLimitInSeconds() + "s");

            if (timed.IsTimeUp(elapsedSeconds)) {
                System.out.println("\nVocê demorou demais e errou a rodada.");
                PlayerWasCorrect = false;
                PlayerAnswered = true;

                Player.TakeDamage(10);
                return;
            }
        }

        PlayerWasCorrect = RoundQuestion.CheckAnswer(PlayerAnswer);
        PlayerAnswered = true;

        if(PlayerWasCorrect){
            int damage = CalculateBaseDamage(Player);
            Enemy.TakeDamage(damage);
            System.out.println("\n" + "─".repeat(50));

            System.out.println("RESULTADO: ACERTOU!");
            System.out.println("Resposta: " + RoundQuestion.getCorrectAnswer());
            System.out.println("Dano causado ao inimigo: " + damage);
            System.out.println("\n" + "─".repeat(50));

            if (Player instanceof SpecialAbility&& !(Player instanceof FortuneTeller)) {
                ((SpecialAbility) Player).activateAbility(this);
            }

        } else {
            System.out.println("\n" + "─".repeat(50));
            System.out.println("RESULTADO: ERROU!");
            System.out.println("Resposta correta: " + RoundQuestion.getCorrectAnswer());
            System.out.println("Sua resposta: " + PlayerAnswer);
            System.out.println("─".repeat(50));

            //Se o jogador escolhido for o Bobo
            if (Player instanceof Fool) {
                System.out.println("[Bobo] Você errou, mas seu palpite confuso causou dano!");
                int pityDamage = Player.getDamage() * Difficulty.EASY.getBaseDamage();
                Enemy.TakeDamage(pityDamage);
                System.out.println("Dano de consolação causado: " + pityDamage);
            }
        }
    }

    private void BotTurn(){
        System.out.println("\n" + "─".repeat(50));
        System.out.println("TURNO INIMIGO");
        System.out.println("=".repeat(50));

        System.out.println("O inimigo está escolhendo uma resposta...");

        if(botAnswerer.getBotAnswer(RoundQuestion, Enemy)){
            int damage = CalculateBaseDamage(Enemy);

            if (Player instanceof Fool) {
                damage *= 2;
                System.out.println("[Bobo] O Bobo recebeu o dobro de dano!");
            }

            Player.TakeDamage(damage);

            System.out.println("\n" + "─".repeat(50));

            System.out.println("RESULTADO: ACERTOU!");
            System.out.printf("Dano causado à você: " + damage);

            System.out.println("\n" + "─".repeat(50));
        } else {
            System.out.println("\n" + "─".repeat(50));

            System.out.println("RESULTADO: ERROU!");

            System.out.println("─".repeat(50));
        }
    }

    private int CalculateBaseDamage(Character character){
        return character.getDamage() * RoundQuestion.getDifficulty().getBaseDamage();
    }

}
