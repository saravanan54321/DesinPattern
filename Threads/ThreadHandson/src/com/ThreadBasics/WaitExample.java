package com.ThreadBasics;

public class WaitExample {
    public static void main(String[] args) {
    	// this lock only for communication between threads
    	// it doesnt shares the data 
        final Object lock = new Object(); // Shared lock object

        // 👶 Child thread (waits)
        Thread waitingThread = new Thread(() -> {
            synchronized (lock) {
            	//1.
                System.out.println("👶 Child thread: Waiting...");
                try {
                    lock.wait(); // Waits and releases the lock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //3.
                System.out.println("👶 Child thread: Resumed after notify");
            }
        });

        // 👨 Main thread (notifier)
        Thread notifierThread = new Thread(() -> {
            try {
                Thread.sleep(6000); // Let child thread wait first
                synchronized (lock) {
                    System.out.println("👨 Notifier thread: Sending notify");
                    //2.
                    lock.notify(); // Wakes up the waiting thread
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        waitingThread.start();
        notifierThread.start();
    }
}

