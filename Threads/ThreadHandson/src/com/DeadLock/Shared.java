package com.DeadLock;

// resolved 
class Shared {
    void methodA() {
        synchronized (this) {
            System.out.println("🧵 Thread A locked 'this'");
}

            synchronized (String.class) {
                System.out.println("🧵 Thread A also locked 'String.class'");
                System.out.println("🧵 Thread A completed");
            }
        }
    

    void methodB() {
        synchronized (this) {
            System.out.println("🧵 Thread B locked 'this'");
           

            synchronized (String.class) {
                System.out.println("🧵 Thread B also locked 'String.class'");
                System.out.println("🧵 Thread B completed");
            }
        }
    }
}