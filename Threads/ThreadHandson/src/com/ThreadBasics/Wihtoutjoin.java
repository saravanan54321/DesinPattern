package com.ThreadBasics;

// Because main thread may finish before child threads do all their work. 
public class Wihtoutjoin {
	 public static void main(String[] args) {
	        final Counter counter = new Counter();

	        // 👶 Child thread - increments counter
	        Thread thread1 = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
	                counter.increment();
	            }
	        });

	        // 👨 Another thread - also increments counter
	        Thread thread2 = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
	                counter.increment();
	            }
	        });

	        thread1.start();
	        thread2.start();

	        // ❌ No join used here

	        System.out.println("Final counter value: " + counter.getValue());
	    }
	}

	// 🔄 Shared resource class
	class Counter {
	    private int value = 0;

	    public synchronized void increment() {
	        value++;
	        System.out.println("Counter incremented to: " + value);
	    }

	    public synchronized int getValue() {
	        return value;
	    }

}
