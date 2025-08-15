package com.racecondition;

class Counter {
    int count = 0;

    public synchronized void increment() {
        count = count + 1;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }
}



