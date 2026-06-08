package model.question;

import java.util.List;

public class TimedMultipleChoiceQuestion extends MultipleChoiceQuestion implements TimedQuestion {
    private int timeLimitInSeconds;

    public TimedMultipleChoiceQuestion(String text, List<String> options, int correctIndex, Difficulty difficulty, int timeLimitInSeconds) {
        super(text, options, correctIndex, difficulty);
        this.timeLimitInSeconds = timeLimitInSeconds;
    }

    @Override
    public void DisplayQuestion() {
        System.out.println("\n⏱ Você tem " + timeLimitInSeconds + " segundos para responder!");
        super.DisplayQuestion();
    }

    @Override
    public int getTimeLimitInSeconds() {
        return this.timeLimitInSeconds;
    }

    @Override
    public boolean IsTimeUp(long elapsedTimeInSeconds) {
        return elapsedTimeInSeconds > this.timeLimitInSeconds;
    }
}