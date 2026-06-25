package model.question;
import java.util.List;

public abstract class Question {
    protected String text;
    protected String correctAnswer;
    protected Difficulty difficulty;

    public Question(String text, String correctAnswer, Difficulty difficulty){
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.difficulty = difficulty;
    }

    public String getText() {
        return this.text;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public abstract boolean checkAnswer(String answer);
    public abstract List<String> getAvailableAnswers();
}
