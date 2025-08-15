package org.example.creationalPattern.Factory.badcode;

public class Car implements  Transport{
    @Override
    public void deliver() {
        System.out.println("i am car");
    }
}
