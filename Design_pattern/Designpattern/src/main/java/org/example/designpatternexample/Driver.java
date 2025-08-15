package org.example.designpatternexample;

 public class Driver extends User {

   private Vehicle vehicle;


     public Driver(String name, Location location,Vehicle vehicle) {
         super(name, location);
         this.vehicle= vehicle;
     }



     public Vehicle getVehicle() {
         return vehicle;
     }

     public void notify(String msg) {
         System.out.println("Driver:" + msg);

     }


     @Override
     public String toString() {
         return name + getVehicle().numberPlate ;
     }

 }
