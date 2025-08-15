package org.example.Behaviouralpattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements  Subject{


     private   float temperature;

     private List<Observer> observerList;

    WeatherStation(){
        observerList= new ArrayList<>();
    }

    public  void setTemperature(float temperature){

        this.temperature=temperature;
        // after setting the temperature we have to notify the observers
        //so call the notify method
        notifyObserver();


    }
    @Override
    public void attach(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void dettach(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObserver() {

        for(Observer obs : observerList){
            obs.update(temperature);
        }


    }
}
