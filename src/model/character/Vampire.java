package model.character;

import model.battle.Round;

import java.util.Scanner;

public class Vampire extends Character implements SpecialAbility {
    public Vampire() {
        // Name, Health, MaxHealth, Damage, Speed, Defense
        super("Vampiro", 120, 120, 25, 5, 5);
    }

    @Override
    public void HealCharacter() {
        this.Heal(30);
    }

    @Override
    public void onBeforeAnswer(Round roundContext, Scanner scanner) {}

    @Override
    public void onAfterAnswer(Round roundContext, boolean isCorrect) {
        if (isCorrect) {
            this.Heal(15);
            System.out.println("[Vampiro] Drenagem de Sangue! Recuperou 15 de vida.");
        }
    }

    @Override
    public String getAbilityDescription() {
        return "Recupera 15 de vida ao acertar uma questão.";
    }
}