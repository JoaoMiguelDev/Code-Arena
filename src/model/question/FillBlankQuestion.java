package model.question;

import java.util.List;

public class FillBlankQuestion extends Question{

    public FillBlankQuestion(String text, String correctAnswer, Difficulty difficulty) {
        super(text, correctAnswer, difficulty);
    }

    @Override
    public void DisplayQuestion() {
        System.out.println("\n" + Text);
        System.out.println("─────────────────────────────────");
        System.out.print("Digite a palavra que completa a lacuna: ");
    }

    @Override
    public boolean CheckAnswer(String answer) {
        if (answer == null) return false;
        return answer.trim().equalsIgnoreCase(CorrectAnswer.trim());
    }

    @Override
    public List<String> GetAvailableAnswers() {
        return List.of(CorrectAnswer);
    }
}
