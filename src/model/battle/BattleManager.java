package model.battle;

import model.character.Character;
import model.question.Difficulty;
import model.question.Question;
import model.question.QuestionBank;
import java.util.*;

public class BattleManager {
    private int RoundIndex = 0;
    private int RoundNumber = 1;
    private Character Player;
    private Character Enemy;
    private List<Question> BattleQuestions;
    private QuestionBank questionBank;
    private int BattleNumber;
    private BattleStatus battleStatus;

    public enum BattleStatus{
        ONGOING, PLAYER_WON, ENEMY_WON
    }

    public BattleManager(Character player, Character enemy, int battleNumber){
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
        System.out.println("⚔️ A BATALHA " + BattleNumber + " COMEÇOU! ⚔️");
        System.out.println("─".repeat(50));

        DisplayIntro();

        while(battleStatus == BattleStatus.ONGOING){
            try{
                Question tryGetQuestion = BattleQuestions.get(RoundIndex);
            } catch (IndexOutOfBoundsException e){
                RoundIndex = 0;
                Collections.shuffle(BattleQuestions);
            }

            Question CurrentQuestion = BattleQuestions.get(RoundIndex);
            Round round = new Round(RoundNumber, CurrentQuestion, Player, Enemy);
            round.ExecuteRound(scanner);
            DisplayRoundResult();

            RoundIndex ++;
            RoundNumber ++;

            CheckBattleEnd();
        }


    }

    public void DisplayIntro(){
        Player.DisplayCharacterInfo();

        System.out.println("─".repeat(50));

        Enemy.DisplayCharacterInfo();

        System.out.println("─".repeat(50));
    }

    public void DisplayRoundResult(){
        System.out.println("─".repeat(50));

        System.out.println("YOU: " + Player.getName());
        System.out.println("Health: " + Player.getHealth());

        System.out.println("─".repeat(50));

        System.out.println("ENEMY: " + Enemy.getName());
        System.out.println("Health: " + Enemy.getHealth());

        System.out.println("─".repeat(50));
    }

    private void CheckBattleEnd(){
        if(!Player.isAlive()){
            battleStatus = BattleStatus.ENEMY_WON;
            System.out.println("\nYOU LOST!");
        } else if (!Enemy.isAlive()) {
            battleStatus = BattleStatus.PLAYER_WON;
            System.out.println("\nYOU WON!");
        }
    }

}
