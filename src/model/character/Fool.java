package model.character;

import model.battle.Round;

public class Fool extends Character implements SpecialAbility {
    public Fool() {
        super("Bobo", 80, 80, 40, 10, 0);
    }

    @Override
    public void healCharacter() {
        this.heal(10);
    }

    @Override
    public void onBeforeAnswer(Round roundContext) {}

    @Override
    public void onAfterAnswer(Round roundContext, boolean isCorrect) {
        if (!isCorrect) {
            int pityDamage = this.getDamage() / 2;
            roundContext.getEnemy().takeDamage(pityDamage);
        }
    }

    @Override
    public String getAbilityDescription() {
        return "Errar causa dano de consolação, mas recebe o dobro de dano do oponente.";
    }

    @Override
    public int modifyIncomingDamage(int baseDamage) {
        return baseDamage * 2;
    }
}