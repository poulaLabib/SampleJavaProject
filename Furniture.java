package com.example.zoo;

public class Furniture {
    private String type;
    private String material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }
}