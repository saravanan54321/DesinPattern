package org.example.creationalPattern.Factory.goodcode;



public class TransportService {

    public static void main(String[] args) {

        //here client is not responsible for creating object
        // he/she is only responsible for calling the objets
        Transport vehicle = TransportFactory.createTransport("bus");
        vehicle.deliver();

    }
}
