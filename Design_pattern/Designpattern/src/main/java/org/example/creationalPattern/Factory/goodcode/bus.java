package org.example.creationalPattern.Factory.goodcode;



public class bus implements Transport {
    @Override
    public void deliver() {
        System.out.println("i am bus");
    }
}