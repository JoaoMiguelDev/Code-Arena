package model.question;

import java.util.List;

public class FillBlankQuestion extends Question{

    public FillBlankQuestion(String text, String correctAnswer, Difficulty difficulty) {
        super(text, correctAnswer, difficulty);
    }

    @Override
    public boolean checkAnswer(String answer) {
        if (answer == null) return false;
        return answer.trim().equalsIgnoreCase(correctAnswer.trim());
    }

    @Override
    public List<String> getAvailableAnswers() {
        return List.of(correctAnswer);
    }
}
