package model.character;

import model.battle.Round;

import java.util.Scanner;

public class FortuneTeller extends Character implements SpecialAbility {
    private boolean abilityUsedThisRound;

    public FortuneTeller() {
        // Name, Health, MaxHealth, Damage, Speed, Defense
        super("Cartomante", 180, 180, 5, 2, 4);
        this.abilityUsedThisRound = false;
    }

    @Override
    public void HealCharacter() {
        this.Heal(40);
    }

    @Override
    public void onBeforeAnswer(Round roundContext, Scanner scanner) {
        if (roundContext.getRoundQuestion() instanceof model.question.MultipleChoiceQuestion mcq) {
            this.abilityUsedThisRound = false;

            System.out.println("[Cartomante] Deseja usar sua habilidade 'Visão do Futuro' para eliminar uma alternativa?");
            System.out.print("(S/N): ");
            String useAbility = scanner.nextLine().trim().toUpperCase();

            if (useAbility.equals("S")) {
                char incorrectLetter = mcq.getIncorrectOption();
                this.abilityUsedThisRound = true;

                System.out.println("\n[Cartomante] Visão do Futuro ativada para esta rodada!");
                System.out.println("👉 Dica: A alternativa [" + incorrectLetter + "] está incorreta!");
            }
        }
    }

    @Override
    public void onAfterAnswer(Round roundContext, boolean isCorrect) {}

    @Override
    public String getAbilityDescription() {
        return "Por rodada, pode escolher a dificuldade das questões e eliminar uma alternativa errada.";
    }
}