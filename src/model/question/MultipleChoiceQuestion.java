package model.question;

import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> Options;
    private int CorrectIndex;

    public MultipleChoiceQuestion(String text, List<String> options, int correctIndex, Difficulty difficulty) {

    }
    @Override
    public void displayQuestion() {

    }

    @Override
    public boolean checkAnswer(Object answer) {
        return false;
    }

    @Override
    public List<String> getAvailableAnswers() {
        return List.of();
    }
}
