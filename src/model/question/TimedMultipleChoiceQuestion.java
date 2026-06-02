package model.question;

import java.util.List;

public class TimedMultipleChoiceQuestion extends MultipleChoiceQuestion implements TimedQuestion {
    private int timeLimitInSeconds;

    public TimedMultipleChoiceQuestion(String text, List<String> options, int correctIndex, Difficulty difficulty, int timeLimitInSeconds) {
        // Reaproveita o construtor da sua classe mãe
        super(text, options, correctIndex, difficulty);
        this.timeLimitInSeconds = timeLimitInSeconds;
    }

    @Override
    public void DisplayQuestion() {
        // Avisa o jogador sobre o tempo antes de exibir a pergunta
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