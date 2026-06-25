package model.character;

import model.battle.Round;

public interface SpecialAbility {
    void onBeforeAnswer(Round roundContext);
    void onAfterAnswer(Round roundContext, boolean isCorrect);
    String getAbilityDescription();
    default int modifyIncomingDamage(int baseDamage) {
        return baseDamage;
    }
    default boolean choosesDifficulty() {
        return false;
    }
}