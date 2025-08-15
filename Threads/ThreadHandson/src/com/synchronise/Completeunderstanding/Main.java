package com.synchronise.Completeunderstanding;

public class Main {
    public static void main(String[] args) {
        MyTask task = new MyTask(); // shared object

        Thread t1 = new Thread(() -> task.doTask(), "Thread A");
        Thread t2 = new Thread(() -> task.doTask(), "Thread B");

        t1.start();
        t2.start();
    }
}