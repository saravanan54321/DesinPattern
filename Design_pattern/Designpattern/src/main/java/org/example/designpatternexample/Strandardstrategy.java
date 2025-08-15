package org.example.designpatternexample;

public class Strandardstrategy implements FareStartegy {


    @Override
    public double calcFare(Vehicle vehicle, Double distance) {
        return vehicle.getFarePerKm()*distance;
    }
}
