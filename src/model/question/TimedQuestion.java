package model.question;

public interface TimedQuestion {
    int getTimeLimitInSeconds();
    boolean IsTimeUp(long elapsedTimeInSeconds);
}