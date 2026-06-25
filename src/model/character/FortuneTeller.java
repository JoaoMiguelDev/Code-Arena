package model.character;

import model.battle.Round;
import model.question.MultipleChoiceQuestion;
import model.question.Question;

public class FortuneTeller extends Character implements SpecialAbility {

    public FortuneTeller() {
        super("Cartomante", 200, 200, 15, 2, 10);
    }

    @Override
    public void healCharacter() {
        this.heal(30);
    }

    @Override
    public void onBeforeAnswer(Round roundContext) {
        Question currentQuestion = roundContext.getRoundQuestion();
        if (currentQuestion instanceof MultipleChoiceQuestion mcq) {
            roundContext.setEliminatedOption(mcq.getIncorrectOption());
        }
    }

    @Override
    public void onAfterAnswer(Round roundContext, boolean isCorrect) {}

    @Override
    public boolean choosesDifficulty() {
        return true;
    }

    @Override
    public String getAbilityDescription() {
        return "Por rodada, pode escolher a dificuldade das questões e eliminar uma alternativa errada.";
    }
}