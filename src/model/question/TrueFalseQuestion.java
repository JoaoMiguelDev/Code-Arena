package model.question;

import java.util.List;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String text, boolean correctAnswer, Difficulty difficulty){
        // Passa a representação em String diretamente para a classe mãe
        super(text, correctAnswer ? "Verdadeiro" : "Falso", difficulty);
    }

    @Override
    public boolean checkAnswer(String answer){
        if (answer == null || answer.isEmpty()) {
            return false;
        }

        answer = answer.trim().toUpperCase();
        boolean isCorrectTrue = this.correctAnswer.equals("Verdadeiro");

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
    public List<String> getAvailableAnswers() {
        return List.of("A", "B");
    }
}