package model.character;

public abstract class Character {
    protected String Name;
    protected int Health;
    protected int Damage;
    protected int Speed;

    public Character(String name, int health, int damage, int speed){
        this.Name = name;
        this.Health = health;
        this.Damage = damage;
        this.Speed = speed;
    }

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

    public void TakeDamage(int damage){
        Health -= Damage;
    }

    public boolean IsAlive(){
        return Health >= 0;
    }

    public abstract void HealCharacter();
}
