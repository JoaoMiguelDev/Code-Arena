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

    public enum BattleStatus {
        ONGOING, PLAYER_WON, ENEMY_WON
    }

    public BattleManager(Character player, Enemy enemy, int battleNumber) {
        this.Player = player;
        this.Enemy = enemy;
        this.BattleNumber = battleNumber;
        this.questionBank = new QuestionBank();
        this.battleStatus = BattleStatus.ONGOING;
    }

    public void PrepareQuestions(Difficulty difficulty) {
        BattleQuestions = questionBank.FilterByDifficulty(difficulty);
        Collections.shuffle(BattleQuestions);
        RoundIndex = 0;
    }




    public Question getCurrentQuestion() {
        if (BattleQuestions == null || BattleQuestions.isEmpty()) {
            PrepareQuestions(Difficulty.EASY);
        }
        if (RoundIndex >= BattleQuestions.size()) {
            Collections.shuffle(BattleQuestions);
            RoundIndex = 0;
        }
        return BattleQuestions.get(RoundIndex);
    }


    public Round buildCurrentRound() {
        return new Round(RoundNumber, getCurrentQuestion(), Player, Enemy);
    }


    public void advanceRound() {
        RoundIndex++;
        RoundNumber++;
    }


    public void refreshBattleStatus() {
        if (!Player.IsAlive()) {
            battleStatus = BattleStatus.ENEMY_WON;
        } else if (!Enemy.IsAlive()) {
            battleStatus = BattleStatus.PLAYER_WON;
        }
    }

    public boolean playerChoosesDifficulty() {
        return Player instanceof FortuneTeller;
    }

    public void applyPostBattleHeal() {
        Player.HealCharacter();
    }

    public BattleStatus getBattleStatus() { return battleStatus; }
    public Character getPlayer() { return Player; }
    public Enemy getEnemy() { return Enemy; }
}