package model.question;

import java.util.List;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String text, boolean correctAnswer, Difficulty difficulty){
        // Passa a representação em String diretamente para a classe mãe
        super(text, correctAnswer ? "Verdadeiro" : "Falso", difficulty);
    }

    @Override
    public void DisplayQuestion() {
        System.out.println("\n" + Text);
        System.out.println("─────────────────────────────────");
        System.out.println("   A) Verdadeiro");
        System.out.println("   B) Falso");
        System.out.println("─────────────────────────────────");
        System.out.print("Sua resposta (A ou B): ");
    }

    @Override
    public boolean CheckAnswer(String answer){
        if (answer == null || answer.isEmpty()) {
            return false;
        }

        answer = answer.trim().toUpperCase();
        boolean isCorrectTrue = this.CorrectAnswer.equals("Verdadeiro");

        if (answer.equals("A") || answer.equals("VERDADEIRO") ||
                answer.equals("TRUE") || answer.equals("V")) {
            return isCorrectTrue;
        }

        if (answer.equals("B") || answer.equals("FALSO") ||
                answer.equals("FALSE") || answer.equals("F")) {
            return !isCorrectTrue;
        }

        return false;
    }

    @Override
    public List<String> GetAvailableAnswers() {
        return List.of("A", "B");
    }
}