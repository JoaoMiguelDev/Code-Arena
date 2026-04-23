package model.battle;

import java.util.Random;
import model.question.Question;
import model.character.Character;

public class BotAnswerer {
    private Random random;

    public BotAnswerer() {
        this.random = new Random();
    }

    public boolean getBotAnswer(Question question, Character enemy) {
        double chanceToHit = CalculateHitChance(question, enemy);
        double roll = random.nextDouble();

        return roll <= chanceToHit;
    }

    private double CalculateHitChance(Question question, Character enemy){
        return switch (question.getDifficulty()) {
            case EASY -> 0.7;   // 70% de acerto
            case MEDIUM -> 0.5;   // 50% de acerto
            case HARD -> 0.3;   // 30% de acerto
            default -> 0.5;
        };
    }
}
