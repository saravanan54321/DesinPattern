package com.synchronise;

//synchronise block 
//class Printer {
//    public void print(String name) {
//    	//1. both thread comes frst and print
//        System.out.println(name + " is preparing data...");
//        try { Thread.sleep(1000); } catch (Exception e) {}
//        //2. there is a minute differnce os secheduler will tell which 
//        //one should execute 
//        // eg 2 therad got chance means that will go and print 
//        synchronized (this) {
//            System.out.println(name + " is printing...");
//            try { Thread.sleep(1000); } catch (Exception e) {}
//        }
//        
//        //in last  only it will print 
//        
//
//        System.out.println(name + " done printing.\n");
//    }
//}
//----------------------------------------------------------
// using method 
//2. synchrnize Method
// both have to wait
class Printer {
    public synchronized void print(String name) {
        System.out.println(name + " is preparing data...");
        try { Thread.sleep(1000); } catch (Exception e) {}
        
        System.out.println(name + " is printing...");
        try { Thread.sleep(1000); } catch (Exception e) {}
        
        System.out.println(name + " done printing.\n");
    }
}


