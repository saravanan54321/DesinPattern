package org.example.creationalPattern.Factory.goodcode;



public class car implements Transport {
    @Override
    public void deliver() {
        System.out.println("i am car");
    }
}