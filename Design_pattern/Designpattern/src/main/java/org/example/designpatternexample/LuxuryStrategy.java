package org.example.designpatternexample;

public class LuxuryStrategy implements FareStartegy{

    public double calcFare(Vehicle vehicle, Double distance) {
        return vehicle.getFarePerKm()*distance*1.5;
    }
}
