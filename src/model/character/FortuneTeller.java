package model.character;

import model.battle.Round;

public class FortuneTeller extends Character implements SpecialAbility {

    public FortuneTeller() {
        super("Cartomante", 180, 180, 15, 2, 10);
    }

    @Override
    public void HealCharacter() {
        this.Heal(40);
    }

    @Override
    public void onBeforeAnswer(Round roundContext) {}

    @Override
    public void onAfterAnswer(Round roundContext, boolean isCorrect) {}

    @Override
    public String getAbilityDescription() {
        return "Por rodada, pode escolher a dificuldade das questões e eliminar uma alternativa errada.";
    }
}