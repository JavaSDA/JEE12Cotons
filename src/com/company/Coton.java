package com.company;

public class Coton extends Car {

    private String color;
    private String model;

    public Coton(int noOfTires, String plateNumber, String color, String model) {
        super(noOfTires, plateNumber);
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }
}
