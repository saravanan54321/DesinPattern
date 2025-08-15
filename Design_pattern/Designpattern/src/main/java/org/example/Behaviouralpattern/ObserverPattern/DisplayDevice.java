package org.example.Behaviouralpattern.ObserverPattern;

public class DisplayDevice implements Observer {
    @Override
    public void update(float temp) {
        System.out.println("Displaydevice temp"+ temp);
    }
}
