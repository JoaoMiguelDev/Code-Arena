package model.character;

import model.battle.Round;

public interface SpecialAbility {
    void activateAbility(Round roundContext);
    String getAbilityDescription();
}
