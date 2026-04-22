package model.question;

import java.util.List;

public class TrueFalseQuestion extends Question {
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
