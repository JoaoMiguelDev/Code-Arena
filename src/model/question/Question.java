package model.question;
import java.util.List;

public abstract class Question {
    protected String Text;
    protected String CorrectAnswer;
    protected Difficulty Difficulty;

    public abstract void displayQuestion();
    public abstract boolean checkAnswer(Object answer);
    public abstract List<String> getAvailableAnswers();
}
