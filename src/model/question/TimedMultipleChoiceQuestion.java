package model.question;

import java.util.List;

public class TimedMultipleChoiceQuestion extends MultipleChoiceQuestion implements TimedQuestion {
    private int timeLimitInSeconds;

    public TimedMultipleChoiceQuestion(String text, List<String> options, int correctIndex, Difficulty difficulty, int timeLimitInSeconds) {
        super(text, options, correctIndex, difficulty);
        this.timeLimitInSeconds = timeLimitInSeconds;
    }

    @Override
    public int getTimeLimitInSeconds() {
        return this.timeLimitInSeconds;
    }

    @Override
    public boolean isTimeUp(long elapsedTimeInSeconds) {
        return elapsedTimeInSeconds > this.timeLimitInSeconds;
    }
}