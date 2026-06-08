package model.character;

import model.battle.Round;
import java.util.Scanner;

public interface SpecialAbility {
    void onBeforeAnswer(Round roundContext, Scanner scanner);
    void onAfterAnswer(Round roundContext, boolean isCorrect);
    String getAbilityDescription();
}
