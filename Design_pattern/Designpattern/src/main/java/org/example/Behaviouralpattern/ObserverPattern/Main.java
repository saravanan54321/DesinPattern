package org.example.Behaviouralpattern.ObserverPattern;
// weather station and  device eruku  atha weather station oda losse ha attach panitu eruku

// weather station la erunthu temperature data va  antha device ku pass panuren
// one to many
public class Main {

    public static void main(String[] args) {

        // publisher
        WeatherStation weatherStation = new WeatherStation();


        //observer
        DisplayDevice displayDevice = new DisplayDevice();
        MobileDevice mobileDevice = new MobileDevice();


        // the observer needs to attach in the weatherstation
        weatherStation.attach(displayDevice);
        weatherStation.attach(mobileDevice);

        weatherStation.setTemperature(25);



    }
}
