package org.example.creationalPattern.singleton.goodcode;

public class Main {
    public static void main(String[] args) {

        WithSingleton first = WithSingleton.getInstance();
        WithSingleton second = WithSingleton.getInstance();
        if(first.equals(second)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
