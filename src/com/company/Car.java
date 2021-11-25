package com.company;

public class Car {
    private int noOfTires;
    private String plateNumber;

    public Car(int noOfTires, String plateNumber) {
        this.noOfTires = noOfTires;
        this.plateNumber = plateNumber;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
}
