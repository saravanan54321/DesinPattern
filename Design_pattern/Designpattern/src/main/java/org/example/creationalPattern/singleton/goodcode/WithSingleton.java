package org.example.creationalPattern.singleton.goodcode;

public class WithSingleton {

    //2.
    // we will use this variable  inside the static method so that why static
    private  static WithSingleton instance;

    //1.
    // restricting no one can create object for this
    private WithSingleton(){

    }
    //3.
// use to create the object
    public static WithSingleton getInstance(){
        //  already created no need to create again
        if(instance==null){
            instance= new WithSingleton();
        }
        return instance;
    }

}
