package model.question;

import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> Options;
    private int CorrectIndex;

    public MultipleChoiceQuestion(String text, List<String> options, int correctIndex, Difficulty difficulty) {
        super(text, options.get(correctIndex), difficulty);
        this.Options = options;
        this.CorrectIndex = correctIndex;
    }

    public List<String> getOptions() {
        return this.Options;
    }

    public char getIncorrectOption() {
        java.util.Random random = new java.util.Random();

        while (true) {
            int randomIndex = random.nextInt(Options.size());

            if (randomIndex != CorrectIndex) {
                return (char) ('A' + randomIndex);
            }
        }
    }

    @Override
    public void DisplayQuestion() {
        System.out.println("\n" + Text);
        System.out.println("─────────────────────────────────");
        for (int i = 0; i < Options.size(); i++) {
            char letter = (char) ('A' + i);
            System.out.println("   " + letter + ") " + Options.get(i));
        }
        System.out.println("─────────────────────────────────");
        System.out.print("Sua resposta (A, B, C, D): ");
    }

    @Override
    public boolean CheckAnswer(String answer) {
        if (answer == null || answer.isEmpty()) {
            return false;
        }

        answer = answer.trim().toUpperCase();

        if (answer.length() == 1 && answer.charAt(0) >= 'A' && answer.charAt(0) <= 'Z') {
            int selectedIndex = answer.charAt(0) - 'A';
            return selectedIndex == CorrectIndex;
        }

        return answer.equalsIgnoreCase(CorrectAnswer);
    }

    @Override
    public List<String> GetAvailableAnswers() {
        return List.of("A", "B", "C", "D");
    }
}
