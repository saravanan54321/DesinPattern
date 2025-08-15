package org.example.designpatternexample;

public class Client {

    public static void main(String[] args) {

        Location loc1 = new Location(12.9716,77.5946);
        Location loc2 = new Location(12.9532,77.6245);
        Location loc3 = new Location(13.0352,77.6175);

        Vehicle car = new Car("12345");
        Vehicle bike = new Car("7895");

        Driver driver1 = new Driver("A",loc3,car);
        Driver driver2 = new Driver("B",loc2,bike);

        Passenger passenger1 = new Passenger("john",loc1);


        RideMatchingSystem rideMatchingSystem = new RideMatchingSystem();
        rideMatchingSystem.addDriver(driver1);
        rideMatchingSystem.addDriver(driver2);
        rideMatchingSystem.requestRide(passenger1,10,new Strandardstrategy());



    }
}
