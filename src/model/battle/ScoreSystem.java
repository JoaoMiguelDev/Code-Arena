package model.battle;

import model.question.Difficulty;

public class ScoreSystem {
    private int totalScore = 0;
    private int correctAnswers = 0;
    private int wrongAnswers = 0;
    private int enemiesDefeated = 0;

    public void registerAnswer(boolean wasCorrect, Difficulty difficulty) {
        if (wasCorrect) {
            correctAnswers++;
            totalScore += difficulty.getBasePoints();
        } else {
            wrongAnswers++;
        }
    }

    public void registerEnemyDefeated() {
        enemiesDefeated++;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getWrongAnswers() {
        return wrongAnswers;
    }

    public int getQuestionsAnswered() {
        return correctAnswers + wrongAnswers;
    }

    public int getEnemiesDefeated() {
        return enemiesDefeated;
    }

    public double getAccuracyPercentage() {
        int total = getQuestionsAnswered();
        if (total == 0) return 0.0;
        return (correctAnswers * 100.0) / total;
    }
}