package com.example.zoo;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private String address;
    private List<Pet> pets;

    public Owner(String name, String address) {
        this.name = name;
        this.address = address;
        this.pets = new ArrayList<>();
    }

    public void adoptPet(Pet pet) {
        pets.add(pet);
        System.out.println(name + " adopted a new pet");
    }

    public void feedPet(Pet pet, Food food) {
        if (pet instanceof Animal) {
            ((Animal) pet).eat(food);
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Pet> getPets() {
        return pets;
    }
}