package com.synchronise;

public class SyncBlockExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        
        Thread t1 = new Thread(() -> printer.print("User1"));
        Thread t2 = new Thread(() -> printer.print("User2"));

        t1.start();
        t2.start();
    }
}
