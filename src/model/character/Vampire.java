package model.character;

import model.battle.Round;

public class Vampire extends Character implements SpecialAbility {
    public Vampire() {
        super("Vampiro", 120, 120, 25, 5, 5);
    }

    @Override
    public void healCharacter() {
        this.heal(5);
    }

    @Override
    public void onBeforeAnswer(Round roundContext) {}

    @Override
    public void onAfterAnswer(Round roundContext, boolean isCorrect) {
        if (isCorrect) {
            this.heal(15);
        }
    }

    @Override
    public String getAbilityDescription() {
        return "Recupera 15 de vida ao acertar uma questão.";
    }
}