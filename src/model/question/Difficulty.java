package model.question;

public enum Difficulty {
    EASY(1),
    MEDIUM(2),
    HARD(3);

    private int BaseDamage;
    Difficulty(int baseDamage){
        this.BaseDamage = baseDamage;
    }

    public int getBaseDamage() {
        return BaseDamage;
    }
}
