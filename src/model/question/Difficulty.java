package model.question;

public enum Difficulty {
    EASY(1, 10),
    MEDIUM(2, 20),
    HARD(3, 30);

    private int baseDamage;
    private int basePoints;

    Difficulty(int baseDamage, int basePoints){
        this.baseDamage = baseDamage;
        this.basePoints = basePoints;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int getBasePoints() {
        return basePoints;
    }
}