package com.example.zoo;

public class Toy {
    private String type;
    private String color;
    private boolean isChewable;

    public Toy(String type, String color, boolean isChewable) {
        this.type = type;
        this.color = color;
        this.isChewable = isChewable;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public boolean isChewable() {
        return isChewable;
    }
}