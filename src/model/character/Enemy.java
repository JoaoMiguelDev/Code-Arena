package model.character;

public class Enemy extends Character{
    private String EnemyDescription;

    public Enemy(String name, int health, int maxHealth, int damage, int speed, int defense, String EnemyDescription){
        super(name, health, maxHealth, damage, speed, defense);
        this.EnemyDescription = EnemyDescription;
    }

    @Override
    public void HealCharacter() {
        this.Heal(30);
    }

    public String getEnemyDescription(){
        return EnemyDescription;
    }
}
