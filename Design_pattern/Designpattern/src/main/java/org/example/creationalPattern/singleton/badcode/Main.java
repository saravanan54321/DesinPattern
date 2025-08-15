package org.example.creationalPattern.singleton.badcode;

public class Main {



    public static void main(String[] args) {

        // here both the api keys are equal
        // but two differnt objects

        // someone wants to create a object for the same value
        // we should restrict  to create object and  we give the already created object
        WithoutSingleton ws = new WithoutSingleton();
        WithoutSingleton ws2 = new WithoutSingleton();


    }
}
