package com.example.zoo;

public class Cat extends Mammal implements Pet {
    private boolean isIndoor;
    private Owner owner;

    public Cat(String name, int age, boolean isIndoor, Owner owner) {
        super(name, age, "Felis catus", true, 4);
        this.isIndoor = isIndoor;
        this.owner = owner;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow!");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with yarn");
    }

    @Override
    public void showAffection() {
        System.out.println(getName() + " purrs softly");
    }

    public void scratch(Furniture furniture) {
        System.out.println(getName() + " scratches the " + furniture.getType());
    }

    public boolean isIndoor() {
        return isIndoor;
    }
}