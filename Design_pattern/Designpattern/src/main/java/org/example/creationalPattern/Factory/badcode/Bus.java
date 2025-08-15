package org.example.creationalPattern.Factory.badcode;

public class Bus implements  Transport{
    @Override
    public void deliver() {
        System.out.println("i am bus");
    }
}
