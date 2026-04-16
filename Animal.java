package com.example.zoo;

public abstract class Animal {
    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public abstract void makeSound();

    public void eat(Food food) {
        System.out.println(name + " is eating " + food.getName());
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void NewMethod4() {
}
}