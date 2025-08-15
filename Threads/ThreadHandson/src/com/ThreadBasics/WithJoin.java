package com.ThreadBasics;


// main thread will join after completion of child thread.
// it will print the last value.
public class WithJoin {
    public static void main(String[] args) {
        final Counter counter = new Counter();

        // 👶 Child thread - increments counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });

        // 👨 Another thread - also increments counter
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter.getValue());
    }
}




