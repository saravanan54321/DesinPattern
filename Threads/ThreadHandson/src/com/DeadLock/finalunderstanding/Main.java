package com.DeadLock.finalunderstanding;

public class Main {
    public static void main(String[] args) {
        DeadlockExample obj = new DeadlockExample();

        Thread t1 = new Thread(() -> obj.method1(), "Thread A");
        Thread t2 = new Thread(() -> obj.method2(), "Thread B");

        t1.start();
        t2.start();
    }
}