package com.synchronise.Completeunderstanding;
//1.
//one method one block
//class MyTask {
//    public void doTask() {
//        // Only one thread can enter this block at a time on the same object
//        synchronized(this) {
//            System.out.println(Thread.currentThread().getName() + " entered synchronized block");
//            try {
//                Thread.sleep(1000); // Simulate some work
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + " exiting synchronized block");
//        }
//    }
//}

//2.
//----
// one method two block
// here my assumption is  wrong 
//use main class i thing both will run on prallel but it is executing 
// one by one
//class MyTask {
//    public void doTask() {
//        synchronized(this) {
//            System.out.println(Thread.currentThread().getName() + " entered BLOCK 1");
//            try { Thread.sleep(1000); } catch (InterruptedException e) {}
//            System.out.println(Thread.currentThread().getName() + " exiting BLOCK 1");
//        }
//
//        synchronized(this) {
//            System.out.println(Thread.currentThread().getName() + " entered BLOCK 2");
//            try { Thread.sleep(1000); } catch (InterruptedException e) {}
//            System.out.println(Thread.currentThread().getName() + " exiting BLOCK 2");
//        }
//    }
//}

//3.
//-----------------
//If you want both blocks to run in parallel, lock on different objects:
//so you will get mixd output 
class MyTask {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void doTask() {
        Thread t = Thread.currentThread();
        synchronized(lock1) {
            System.out.println(t.getName() + " entered BLOCK 1");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println(t.getName() + " exiting BLOCK 1");
        }

        synchronized(lock2) {
            System.out.println(t.getName() + " entered BLOCK 2");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println(t.getName() + " exiting BLOCK 2");
        }
    }
}

//--------------------------------------------


