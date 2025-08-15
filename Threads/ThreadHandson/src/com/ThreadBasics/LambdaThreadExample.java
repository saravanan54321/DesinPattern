package com.ThreadBasics;
//both main and child thread started independently 
//this will print frst 
//👨 Main thread: Started
//👶 Child thread: Started
//it will sleep two seconds then it will print 👶 Child thread: Finished
//after 1 second it will print beacuse total time is 3 second 
//2 second already left balance 1 second is remaining 
//👨 Main thread: Finished
public class LambdaThreadExample {
    public static void main(String[] args) {

       
        Thread childThread = new Thread(() -> {
            try {
                System.out.println("👶 Child thread: Started");
                Thread.sleep(2000); // sleep 2 seconds
                System.out.println("👶 Child thread: Finished");
            } catch (InterruptedException e) {
                System.out.println("👶 Child thread was interrupted!");
            }
        });

        
        childThread.start();

        try {
            System.out.println("👨 Main thread: Started");
            Thread.sleep(3000); // sleep 3 seconds
            System.out.println("👨 Main thread: Finished");
        } catch (InterruptedException e) {
            System.out.println("👨 Main thread was interrupted!");
        }
    }
}
