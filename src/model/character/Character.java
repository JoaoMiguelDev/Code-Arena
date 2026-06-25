package model.character;

public abstract class Character {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int damage;
    protected int speed;
    protected int defense;

    public Character(String Name, int Health, int MaxHealth, int Damage, int Speed, int Defense){
        this.name = Name;
        this.health = Health;
        this.maxHealth = MaxHealth;
        this.damage = Damage;
        this.speed = Speed;
        this.defense = Defense;
    }

    public int takeDamage(int damageReceived){
        int damageTaken = Math.max(0, damageReceived - defense);
        this.health = Math.max(0, this.health - damageTaken);
        return damageTaken;
    }


    public void heal(int Amount) {
        this.health = Math.min(this.health + Amount, maxHealth);
    }

    public abstract void healCharacter();

    public String getName() { return name; }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() { return maxHealth; }

    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public boolean isAlive(){
        return health > 0;
    }
}