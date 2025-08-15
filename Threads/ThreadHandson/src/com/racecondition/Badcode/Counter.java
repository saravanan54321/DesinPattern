package com.racecondition.Badcode;

class Counter {
    int count = 0;

    public void increment() {
        count = count + 1; // Not synchronized
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }
}