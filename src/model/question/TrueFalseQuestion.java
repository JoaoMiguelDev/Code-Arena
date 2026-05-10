package model.question;

import java.util.List;

public class TrueFalseQuestion extends Question {
    private boolean CorrectAnswer;

    public TrueFalseQuestion(String text, boolean correctAnswer, Difficulty difficulty){
        super(text, correctAnswer ? "Verdadeiro" : "Falso", difficulty);
        this.CorrectAnswer = correctAnswer;
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
        if (answer.equals("A") || answer.equals("VERDADEIRO") ||
                answer.equals("TRUE") || answer.equals("V")) {
            return CorrectAnswer == true;
        }

        if (answer.equals("B") || answer.equals("FALSO") ||
                answer.equals("FALSE") || answer.equals("F")) {
            return CorrectAnswer == false;
        }
        return false;
    }

    @Override
    public List<String> GetAvailableAnswers() {
        return List.of();
    }
}
