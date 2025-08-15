package com.ThreadBasics;


//using thread class 
//Thread class extends the Object class and implements the Runnable interface.
//a.
//public class ThreadBasics extends Thread{
//	
//	public void run(){
//		System.out.println("Running using thread");
//		// checking the thread name 
//		System.out.println("Thread Name "+Thread.currentThread().getName());
//	}
//
//	public static void main(String[] args) {
//		ThreadBasics t1 = new ThreadBasics();
//		// it will create a separate thread and run on the separetae thread 
//		//1.
//		//t1.start();
//		// it will not creates sepaarte thread use main thread 
//		//2.
//		t1.run();

		
//
//	}
//
//}

//issues here 
//ThreadBasics- This class contains logic and act as a thread.
// we are not able to achieve loose coupling 

//------------------------------------------------------------------------


public class ThreadBasics implements Runnable{
	
	public void run(){
		System.out.println("Running using thread");
		// checking the thread name 
		System.out.println("Thread Name "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		// ✅ This is the TASK
		ThreadBasics t1 = new ThreadBasics();
		// it will not create separate  thread 
		//t1.run();
		// Runnable interface has only Run method and not start method so i will get error 
		//t1.start();
		// why this is happening 
		//Runnable-	Holds the task (what to run) yetha run pananum theriyanum
		// ans yeppid and yenga pananum nu theriyathu 
		
		//Thread - Holds the thread (how and when to run it)-it knows eppidi and enga 
		//This is the THREAD that will run the task
		Thread t = new Thread(t1);
		t.start();//Start the new thread, runs run()
		

	}

}
