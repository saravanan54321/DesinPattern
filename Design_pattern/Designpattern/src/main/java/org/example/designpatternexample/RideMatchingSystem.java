package org.example.designpatternexample;

import java.util.ArrayList;
import java.util.List;

public class RideMatchingSystem {

    private List<Driver> availableDrivers = new ArrayList<>();

    public void addDriver(Driver driver){
        availableDrivers.add(driver);

    }


    public void requestRide(Passenger passenger, double Distance,FareStartegy fareStartegy)


    {

        if (availableDrivers.isEmpty()){
                passenger.notify("Driver is not available");
            }


        Driver nearestDriver  = findNearestDriver(passenger.getLocation());

        // remove the currentdriver in the list beacuse  another passenger vantha book pana
        // current driver ha  katum. in genral ride book ana current driver second passenger ku kata
        // kudathu  adhuku than remove panurom
        availableDrivers.remove(nearestDriver);

        // once the driver is available we need to go for the ride right
        // so create a ride object

        Ride ride = new Ride( passenger, Distance, nearestDriver,fareStartegy);
        ride.calculatefare();

        //once the fare has been setted and fare has been calculated

        // notify the respective passenger and driver
        System.out.println(passenger.name+" is assigned to nearest driver :" + nearestDriver.name);
        passenger.notify("Ride schedule with fare of RS "+ride.getFare());


        nearestDriver.notify("you have a request ride of RS "+ride.getFare());

        // change the status of the ride  to of pasenger and driver
        ride.updateStatus(RideStatus.ONGOING);
        ride.updateStatus(RideStatus.COMPLETED);

        availableDrivers.add(nearestDriver);

    }

    private Driver findNearestDriver(Location passengerLocation){

        Driver assignedDriver = null;

        double mindist = Double.MAX_VALUE;

        for( Driver driver: availableDrivers){

            double distance = driver.getLocation().calculateDistance(passengerLocation);

            if(mindist>distance){
                mindist=distance;
                assignedDriver=driver;
            }

        }

        return  assignedDriver;
    }

}
