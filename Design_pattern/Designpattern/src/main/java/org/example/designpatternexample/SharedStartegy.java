package org.example.designpatternexample;

public class SharedStartegy implements FareStartegy {

    public double calcFare(Vehicle vehicle, Double distance) {
        return vehicle.getFarePerKm()*distance*0.5;
    }
}
