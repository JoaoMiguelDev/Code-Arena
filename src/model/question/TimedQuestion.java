package model.question;

public interface TimedQuestion {
    int getTimeLimitInSeconds();
    boolean isTimeUp(long elapsedTimeInSeconds);
}