package model.battle;

import model.character.Character;
import model.character.Enemy;
import model.character.FortuneTeller;
import model.question.Difficulty;
import model.question.Question;
import model.question.QuestionBank;
import java.util.*;

public class BattleManager {
    private int RoundIndex = 0;
    private int RoundNumber = 1;
    private Character Player;
    private Enemy Enemy;
    private List<Question> BattleQuestions;
    private QuestionBank questionBank;
    private int BattleNumber;
    private BattleStatus battleStatus;

    public enum BattleStatus{
        ONGOING, PLAYER_WON, ENEMY_WON
    }

    public BattleManager(Character player, Enemy enemy, int battleNumber){
        this.Player = player;
        this.Enemy = enemy;
        this.BattleNumber = battleNumber;
        this.questionBank = new QuestionBank();
        this.battleStatus = BattleStatus.ONGOING;
    }

    public void PrepareQuestions(Difficulty difficulty){
        BattleQuestions = questionBank.FilterByDifficulty(difficulty);
        Collections.shuffle(BattleQuestions);
    }

    public void ExecuteBattle(Scanner scanner){
        System.out.println("\n" + "─".repeat(50));
        System.out.println("A BATALHA " + BattleNumber + " COMEÇOU!");
        System.out.println("─".repeat(50));

        DisplayIntro();

        while (battleStatus == BattleStatus.ONGOING) {
            if (Player instanceof FortuneTeller) {
                System.out.println("\n[Cartomante] Escolha a dificuldade da próxima pergunta:");
                System.out.println("1 - EASY | 2 - MEDIUM | 3 - HARD");
                System.out.print("Opção: ");
                String choice = scanner.nextLine().trim();

                Difficulty chosenDifficulty = switch (choice) {
                    case "2" -> Difficulty.MEDIUM;
                    case "3" -> Difficulty.HARD;
                    default -> Difficulty.EASY;
                };

                this.PrepareQuestions(chosenDifficulty);
            }
            if (BattleQuestions == null || RoundIndex >= BattleQuestions.size()) {
                RoundIndex = 0;
                if(BattleQuestions == null) this.PrepareQuestions(Difficulty.EASY);
                Collections.shuffle(BattleQuestions);
            }

            Question CurrentQuestion = BattleQuestions.get(RoundIndex);
            Round round = new Round(RoundNumber, CurrentQuestion, Player, Enemy);
            round.ExecuteRound(scanner);
            DisplayRoundResult();

            RoundIndex++;
            RoundNumber++;

            CheckBattleEnd();
        }

    }

    public void DisplayIntro(){
        Player.DisplayCharacterInfo();

        System.out.println("─".repeat(50));

        Enemy.DisplayCharacterInfo();

        System.out.println("─".repeat(50));
    }

    private void DisplayRoundResult(){
        System.out.println("─".repeat(50));

        System.out.println("VOCÊ: " + Player.getName());
        System.out.println("Vida: " + Player.getHealth());

        System.out.println("─".repeat(50));

        System.out.println("INIMIGO: " + Enemy.getName());
        System.out.println("Vida: " + Enemy.getHealth());

        System.out.println("─".repeat(50));
    }

    private void CheckBattleEnd(){
        if(!Player.IsAlive()){
            battleStatus = BattleStatus.ENEMY_WON;
            System.out.println("\nVOCÊ PERDEU!");
        } else if (!Enemy.IsAlive()) {
            battleStatus = BattleStatus.PLAYER_WON;
            System.out.println("\nVOCÊ GANHOU!");
        }
    }

    public BattleStatus getBattleStatus() {
        return battleStatus;
    }
}
