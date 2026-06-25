package model.battle;

import model.character.Character;
import model.character.Enemy;
import model.character.FortuneTeller;
import model.character.SpecialAbility;
import model.question.Difficulty;
import model.question.Question;
import model.question.QuestionBank;
import java.util.*;

public class BattleManager {
    private int roundIndex = 0;
    private int roundNumber = 1;
    private Character player;
    private Enemy enemy;
    private List<Question> battleQuestions;
    private QuestionBank questionBank;
    private int battleNumber;
    private BattleStatus battleStatus;

    public enum BattleStatus {
        ONGOING, PLAYER_WON, ENEMY_WON
    }

    public BattleManager(Character player, Enemy enemy, int battleNumber) {
        this.player = player;
        this.enemy = enemy;
        this.battleNumber = battleNumber;
        this.questionBank = new QuestionBank();
        this.battleStatus = BattleStatus.ONGOING;
    }

    public void prepareQuestions(Difficulty difficulty) {
        battleQuestions = questionBank.FilterByDifficulty(difficulty);
        Collections.shuffle(battleQuestions);
        roundIndex = 0;
    }

    public Question getCurrentQuestion() {
        if (battleQuestions == null || battleQuestions.isEmpty()) {
            prepareQuestions(Difficulty.EASY);
        }
        if (roundIndex >= battleQuestions.size()) {
            Collections.shuffle(battleQuestions);
            roundIndex = 0;
        }
        return battleQuestions.get(roundIndex);
    }


    public Round buildCurrentRound() {
        return new Round(roundNumber, getCurrentQuestion(), player, enemy);
    }


    public void advanceRound() {
        roundIndex++;
        roundNumber++;
    }


    public void refreshBattleStatus() {
        if (!player.isAlive()) {
            battleStatus = BattleStatus.ENEMY_WON;
        } else if (!enemy.isAlive()) {
            battleStatus = BattleStatus.PLAYER_WON;
        }
    }

    public boolean playerChoosesDifficulty() {
        return player instanceof SpecialAbility sa && sa.choosesDifficulty();
    }

    public void applyPostBattleHeal() {
        player.healCharacter();
    }

    public BattleStatus getBattleStatus() { return battleStatus; }
    public Character getPlayer() { return player; }
    public Enemy getEnemy() { return enemy; }
}