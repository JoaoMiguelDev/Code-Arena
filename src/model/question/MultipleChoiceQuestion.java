package model.question;

import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> options;
    private int correctIndex;

    public MultipleChoiceQuestion(String text, List<String> options, int correctIndex, Difficulty difficulty) {
        super(text, options.get(correctIndex), difficulty);
        this.options = options;
        this.correctIndex = correctIndex;
    }

    public List<String> getOptions() {
        return this.options;
    }

    public char getIncorrectOption() {
        java.util.Random random = new java.util.Random();

        while (true) {
            int randomIndex = random.nextInt(options.size());

            if (randomIndex != correctIndex) {
                return (char) ('A' + randomIndex);
            }
        }
    }

    @Override
    public boolean checkAnswer(String answer) {
        if (answer == null || answer.isEmpty()) {
            return false;
        }

        answer = answer.trim().toUpperCase();

        if (answer.length() == 1 && answer.charAt(0) >= 'A' && answer.charAt(0) <= 'Z') {
            int selectedIndex = answer.charAt(0) - 'A';
            return selectedIndex == correctIndex;
        }

        return answer.equalsIgnoreCase(correctAnswer);
    }

    @Override
    public List<String> getAvailableAnswers() {
        return List.of("A", "B", "C", "D");
    }
}
