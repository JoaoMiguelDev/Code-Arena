package model.character;

public abstract class Character {
    protected String Name;
    protected int Health;
    protected int MaxHealth;
    protected int Damage;
    protected int Speed;
    protected int Defense;

    public Character(String Name, int Health, int MaxHealth, int Damage, int Speed, int Defense){
        this.Name = Name;
        this.Health = Health;
        this.MaxHealth = MaxHealth;
        this.Damage = Damage;
        this.Speed = Speed;
        this.Defense = Defense;
    }

    public void TakeDamage(int DamageReceived){
        int DamageTaken = Math.max(0, DamageReceived - Defense);
        this.Health = Math.max(0, this.Health - DamageTaken);
    }

    public void Heal(int Amount) {
        this.Health = Math.min(this.Health + Amount, MaxHealth);
    }

    public abstract void HealCharacter();

    public void DisplayCharacterInfo(){
        System.out.println(Name);
        System.out.println("Health: " + Health+"/"+MaxHealth);
        System.out.println("Damage: " + Damage);
        System.out.println("Speed: " + Speed);
        System.out.println("Defense: " + Defense);
    }

    public String getName() { return Name; }

    public int getHealth() {
        return Health;
    }

    public int getMaxHealth() { return MaxHealth; }

    public int getSpeed() {
        return Speed;
    }

    public int getDamage() {
        return Damage;
    }

    public boolean IsAlive(){
        return Health > 0;
    }
}
