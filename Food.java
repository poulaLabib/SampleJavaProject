package com.example.zoo;

public class Food {
    private String name;
    private String type;
    private double calories;

    public Food(String name, String type, double calories) {
        this.name = name;
        this.type = type;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getCalories() {
        return calories;
    }
}