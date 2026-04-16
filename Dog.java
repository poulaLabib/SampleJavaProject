package com.example.zoo;

public class Dog extends Mammal implements Pet {
    private String breed;
    private Owner owner;

    public Dog(String name, int age, String breed, Owner owner) {
        super(name, age, "Canis familiaris", true, 4);
        this.breed = breed;
        this.owner = owner;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof! Woof!");
    }

    @Override
    public void showAffection() {
        System.out.println(getName() + " wags tail and licks owner");
    }

    public void fetch(Toy toy) {
        System.out.println(getName() + " fetches the " + toy.getType());
    }

    public String getBreed() {
        return breed;
    }

    public Owner getOwner() {
        return owner;
    }
}