package model.character;

public abstract class Character {
    private String Name;
    private int Health;
    private int Damage;
    private int Speed;

    public String getName() {
        return Name;
    }

    public int getHealth() {
        return Health;
    }

    public int getSpeed() {
        return Speed;
    }

    public int getDamage() {
        return Damage;
    }
}
