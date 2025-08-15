package org.example.creationalPattern.Builder.badcode;

public class Withoutbuilder {

    public static void main(String[] args) {

        House house = new House("A","b","c",true,true,false);
        System.out.println(house);

    }
}
