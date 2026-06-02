package model.character;

import model.battle.Round;

public class Vampire extends Character implements SpecialAbility {
    public Vampire() {
        // Name, Health, MaxHealth, Damage, Speed, Defense
        super("Vampiro", 120, 120, 10, 5, 2);
    }

    @Override
    public void HealCharacter() {
        this.Heal(30); // Cura extra pós-batalha
    }

    @Override
    public void activateAbility(Round roundContext) {
        this.Heal(15);
        System.out.println("[Vampiro] Drenagem de Sangue! Recuperou 15 de vida.");
    }

    @Override
    public String getAbilityDescription() {
        return "Recupera 15 de vida ao acertar uma questão.";
    }
}