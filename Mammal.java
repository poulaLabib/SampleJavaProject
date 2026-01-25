package com.example.zoo;

public class Mammal extends Animal {
    private boolean hasFur;
    private int numberOfLegs;

    public Mammal(String name, int age, String species, boolean hasFur, int numberOfLegs) {
        super(name, age, species);
        this.hasFur = hasFur;
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void makeSound() {
        System.out.println("Generic mammal sound");
    }

    public void giveBirth() {
        System.out.println(getName() + " is giving birth");
    }

    public boolean hasFur() {
        return hasFur;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}