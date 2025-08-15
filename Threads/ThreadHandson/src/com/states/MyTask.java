package com.states;

class MyTask extends Thread {
    public void run() {
        System.out.println("State: RUNNABLE - " + this.getState());

        synchronized (this) {
            try {
                wait(); // Moves to WAITING state
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread resumed...");
    }
}


