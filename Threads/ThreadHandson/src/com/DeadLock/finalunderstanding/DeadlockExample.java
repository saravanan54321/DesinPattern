package com.DeadLock.finalunderstanding;
// i am uunderstanding fault code here 
// here T1 enters method one  get the frst lock
//T2 enters Method Two  get the frst lock \
// After completion T1 is try to enter second synchronized block of same method 
//but it was hold by second method it will not come out 
// go to second method it will wait for frst method release , so second method wont come out
class DeadlockExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
    	//1. T1
        synchronized(lock1) {
            System.out.println(Thread.currentThread().getName() + " locked LOCK 1");
         //here it will check t2 holding 
            synchronized(lock2) {
                System.out.println(Thread.currentThread().getName() + " locked LOCK 2");
            }
        }
    }

    public void method2() {
    	//1. T2
        synchronized(lock2) {
            System.out.println(Thread.currentThread().getName() + " locked LOCK 2");
          // t1 holding it will not finish
            synchronized(lock1) {
                System.out.println(Thread.currentThread().getName() + " locked LOCK 1");
            }
        }
    }
}