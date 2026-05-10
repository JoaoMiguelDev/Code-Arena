package model.character;

public class Dummy extends Character {
    //This is just an experimental character, used for early prototyping

    public Dummy(){
        super("Dummy", 60, 5, 1);
    }

    @Override
    public void HealCharacter() {
        Health = Health + (60 - Health);
    }
}
