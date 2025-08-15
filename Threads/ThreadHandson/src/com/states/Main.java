package com.states;

public class Main {
    public static void main(String[] args) throws Exception {
        MyTask t1 = new MyTask();

        System.out.println("State: NEW - " + t1.getState()); // Thread not started yet

        t1.start(); // Thread moves to RUNNABLE

        Thread.sleep(1000); // Give time for t1 to start and enter wait()

        System.out.println("State after wait(): " + t1.getState()); // Should be WAITING

        synchronized (t1) {
            t1.notify(); // Wakes up t1
        }

        Thread.sleep(1000); // Give time for t1 to finish

        System.out.println("State: TERMINATED - " + t1.getState()); // Thread finished
    }
}