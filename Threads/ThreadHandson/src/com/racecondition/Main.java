package com.racecondition;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> counter.increment(), "Thread A");
        Thread t2 = new Thread(() -> counter.increment(), "Thread B");

        t1.start();
        t2.start();

        System.out.println("Final count (maybe still early): " + counter.count);
    }
}