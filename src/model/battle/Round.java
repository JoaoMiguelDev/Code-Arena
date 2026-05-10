package model.battle;


import model.question.Question;
import model.character.Character;
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
        System.out.println("ROUND " + RoundNumber);
        System.out.println("Question difficulty: " + RoundQuestion.getDifficulty());
        System.out.println("=".repeat(50));

        System.out.println("YOU: " + Player.getName());
        System.out.println("Health: " + Player.getHealth());

        System.out.println("=".repeat(50));

        System.out.println("ENEMY: " + Enemy.getName());
        System.out.println("Health: " + Enemy.getHealth());

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

//        if (!Enemy.IsAlive()) {
//            return true;
//        }

          BotTurn();
        } else {
            BotTurn();
            PlayerTurn(scanner);
        }
    }

    private void PlayerTurn(Scanner scanner){
        System.out.println("\n" + "─".repeat(50));
        System.out.println("YOUR TURN");
        System.out.println("=".repeat(50));

        System.out.println("Choose an answer:");

        PlayerAnswer = scanner.nextLine().trim();
        PlayerWasCorrect = RoundQuestion.CheckAnswer(PlayerAnswer);
        PlayerAnswered = true;

        if(PlayerWasCorrect){
            int damage = CalculateBaseDamage(Player);
            Enemy.TakeDamage(damage);
            System.out.println("\n" + "─".repeat(50));

            System.out.println("RESULTADO: ACERTOU!");
            System.out.println("Resposta: " + RoundQuestion.getCorrectAnswer());
            System.out.printf("Dano causado ao inimigo: " + damage);

            System.out.println("\n" + "─".repeat(50));
        } else {
            System.out.println("\n" + "─".repeat(50));

            System.out.println("RESULTADO: ERROU!");
            System.out.println("Resposta correta: " + RoundQuestion.getCorrectAnswer());
            System.out.println("Sua resposta: " + PlayerAnswer);

            System.out.println("─".repeat(50));
        }

    }

    private void BotTurn(){
        System.out.println("\n" + "─".repeat(50));
        System.out.println("BOT TURN");
        System.out.println("=".repeat(50));

        System.out.println("The bot is choosing an answer...");

        if(botAnswerer.getBotAnswer(RoundQuestion, Enemy)){
            int damage = CalculateBaseDamage(Enemy);

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
