package it.figuccia;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("Moo");
    }

}
