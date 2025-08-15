package com.ThreadBasics;

public class SharedResourceWithWait {
    public static void main(String[] args) {
        final Object lock = new Object(); // used for both locking and communication
        final int[] counter = {0};        // shared resource

        // 👶 Child thread - waits until counter becomes 1
        Thread waitingThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("👶 Waiting thread: Checking counter...");
                while (counter[0] == 0) {
                    try {
                        System.out.println("👶 Counter is 0. Waiting...");
                        lock.wait(); // Wait until notified
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("👶 Counter is now " + counter[0] + ". Proceeding...");
            }
        });
        // i am modifiyig shared resource
        // 👨 Notifier thread - increases the counter and notifies
        Thread notifierThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate delay
            } catch (InterruptedException e) {}

            synchronized (lock) {
                counter[0] = 1; // 🔒 modify shared resource
                System.out.println("👨 Notifier thread: Counter updated to " + counter[0]);
                lock.notify(); // 📣 notify waiting thread
            }
        });

        waitingThread.start();
        notifierThread.start();
    }
}

