package org.example.Behaviouralpattern.ObserverPattern;

public class MobileDevice implements  Observer{
    @Override
    public void update(float temp) {
        System.out.println("Mobile device temp"+ temp);
    }
}
