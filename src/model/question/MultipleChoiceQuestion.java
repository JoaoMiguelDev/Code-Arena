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

    public char getIncorrectOption() {
        java.util.Random random = new java.util.Random();

        while (true) {
            // Sorteia um índice qualquer entre 0 e o total de opções (ex: 0 a 3)
            int randomIndex = random.nextInt(Options.size());

            // Se o índice sorteado for DIFERENTE do índice correto, encontrámos uma errada!
            if (randomIndex != CorrectIndex) {
                // Converte o índice numérico para a letra correspondente (0 -> 'A', 1 -> 'B', etc.)
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

        // Remove espaços e converte para maiúsculo
        answer = answer.trim().toUpperCase();

        // Caso 1: Usuário respondeu com letra (A, B, C, D)
        if (answer.length() == 1 && answer.charAt(0) >= 'A' && answer.charAt(0) <= 'Z') {
            int selectedIndex = answer.charAt(0) - 'A';
            return selectedIndex == CorrectIndex;
        }

        // Caso 2: Usuário respondeu com o texto completo
        return answer.equalsIgnoreCase(CorrectAnswer);
    }

    @Override
    public List<String> GetAvailableAnswers() {
        return List.of();
    }
}
