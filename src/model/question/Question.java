package model.question;
import java.util.List;

public abstract class Question {
    protected String Text;
    protected String CorrectAnswer;
    protected Difficulty Difficulty;

    public Question(String text, String correctAnswer, Difficulty difficulty){
        this.Text = text;
        this.CorrectAnswer = correctAnswer;
        this.Difficulty = difficulty;
    }

    public Difficulty getDifficulty() {
        return Difficulty;
    }

    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

    public abstract void DisplayQuestion();
    public abstract boolean CheckAnswer(String answer);
    public abstract List<String> GetAvailableAnswers();
}
