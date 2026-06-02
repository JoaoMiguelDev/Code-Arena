package model.character;

import model.battle.Round;

public class Fool extends Character implements SpecialAbility {
    public Fool() {
        super("Bobo", 80, 80, 40, 10, 0);
    }

    @Override
    public void HealCharacter() {
        this.Heal(20);
    }

    @Override
    public void activateAbility(Round roundContext) {
        // A lógica do bobo é passiva/reativa, pode ser disparada no cálculo de dano
    }

    @Override
    public String getAbilityDescription() {
        return "Errar causa dano de questão fácil, mas recebe o dobro de dano do oponente.";
    }
}