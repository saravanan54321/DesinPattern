package org.example.designpatternexample;

public class Ride {

    private Passenger passenger;

    private Driver driver;


    private double distance;


    private FareStartegy fareStartegy;



    private double fare;


    private RideStatus status;


    public Ride(Passenger passenger,  double distance, Driver driver,FareStartegy fareStartegy) {
        this.passenger = passenger;
        this.driver = driver;
        this.distance = distance;
        this.fareStartegy = fareStartegy;
        this.status= RideStatus.SCHEDULED;
    }

    public void calculatefare(){

        this.fare= fareStartegy.calcFare(driver.getVehicle(),distance);


    }

    public void updateStatus(RideStatus status){
        this.status= status;
        notifyUsers(status);

    }
    public double getFare(){
        return  fare;
    }
    public void notifyUsers(RideStatus status){
        passenger.notify("Your ride is "+status);
        driver.notify("Ride Status "+status);

    }





}
