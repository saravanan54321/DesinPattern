package org.example.designpatternexample;

abstract  class Vehicle {

    String numberPlate;

    public Vehicle(String numberPlate) {
        this.numberPlate = numberPlate;
    }


    public abstract double getFarePerKm();
}
