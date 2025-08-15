package com.interput;


// After 2 second it will interput 
public class InterruptExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                System.out.println("🛏️ Thread sleeping...");
                //3.
                Thread.sleep(5000); // sleeping for 5 seconds
                System.out.println("😴 Woke up!");
            } catch (InterruptedException e) {
                System.out.println("⚠️ Interrupted while sleeping!");
            }
        });
        //1.
        t.start();
    
        // Interrupt the thread after 2 seconds
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        //2.
        t.interrupt(); // 🔴 Interrupting the sleeping thread
    }
}
