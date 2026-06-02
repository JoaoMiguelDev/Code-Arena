package model.character;

import model.battle.Round;

public class FortuneTeller extends Character implements SpecialAbility {
    private boolean abilityUsedThisRound;

    public FortuneTeller() {
        // Name, Health, MaxHealth, Damage, Speed, Defense
        super("Cartomante", 180, 180, 5, 2, 4);
        this.abilityUsedThisRound = false;
    }

    @Override
    public void HealCharacter() {
        this.Heal(40); // Boa cura passiva pós-batalha por ser tanque
    }

    @Override
    public void activateAbility(Round roundContext) {
        // Como a habilidade dela é usada ANTES de responder (para ajudar a acertar),
        // o gatilho principal será chamado direto no fluxo do Round.
        System.out.println("\n[Cartomante] Visão do Futuro ativada para esta rodada!");
        this.abilityUsedThisRound = true;
    }

    @Override
    public String getAbilityDescription() {
        return "Por rodada, pode escolher a dificuldade das questões e eliminar uma alternativa errada.";
    }

    // Getters e Setters auxiliares para controlar o estado da habilidade na rodada
    public boolean hasUsedAbilityThisRound() {
        return abilityUsedThisRound;
    }

    public void setAbilityUsedThisRound(boolean used) {
        this.abilityUsedThisRound = used;
    }
}