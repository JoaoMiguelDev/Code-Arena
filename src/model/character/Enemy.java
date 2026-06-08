package model.character;

public class Enemy extends Character{

    public Enemy(String name, int health, int maxHealth, int damage, int speed, int defense){
        super(name, health, maxHealth, damage, speed, defense);
    }

    @Override
    public void HealCharacter() {
        this.Heal(30);
    }
}
