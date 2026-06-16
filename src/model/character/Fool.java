package model.character;

import model.battle.Round;

import java.util.Scanner;

public class Fool extends Character implements SpecialAbility {
    public Fool() {
        super("Bobo", 80, 80, 40, 10, 0);
    }

    @Override
    public void HealCharacter() {
        this.Heal(20);
    }

    @Override
    public void onBeforeAnswer(Round roundContext, Scanner scanner) {}

    @Override
    public void onAfterAnswer(Round roundContext, boolean isCorrect) {
        if (!isCorrect) {
            System.out.println("\n[Bobo] Você errou, mas seu palpite confuso causou dano!");
            int pityDamage = this.getDamage() / 2;

            roundContext.getEnemy().TakeDamage(pityDamage);
            System.out.println("Dano de consolação causado: " + pityDamage);
        }
    }

    @Override
    public String getAbilityDescription() {
        return "Errar causa dano de questão fácil, mas recebe o dobro de dano do oponente.";
    }
}