package com.daemonThread;

public class LoggerDaemon {
    public static void main(String[] args) {
        Thread logger = new Thread(() -> {
            while (true) {
                System.out.println("📋 Logging system is running...");
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });

        logger.setDaemon(true);  // Make it a daemon thread
        logger.start();

        // Simulate main application task
        System.out.println("🚀 Application started...");
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        System.out.println("🛑 Application finished.");
    }
}
