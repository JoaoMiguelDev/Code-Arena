package model.character;

public class Enemy extends Character{
    private String enemyDescription;

    public Enemy(String name, int health, int maxHealth, int damage, int speed, int defense, String enemyDescription){
        super(name, health, maxHealth, damage, speed, defense);
        this.enemyDescription = enemyDescription;
    }

    @Override
    public void healCharacter() {
        this.heal(30);
    }

    public String getEnemyDescription(){
        return enemyDescription;
    }
}
