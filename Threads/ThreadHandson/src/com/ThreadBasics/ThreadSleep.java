package com.ThreadBasics;

public class ThreadSleep {
	
	public static void main(String[] args) {
        System.out.println("Task started...");

        try {
            // Sleep for 3 seconds (3000 milliseconds)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // it will print after three second 
        System.out.println("Task finished after 3 seconds.");
    }
}
