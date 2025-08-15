package org.example.Behaviouralpattern.MediatorPattern.Badcode;

public class User {

    String name;
    User(String name){
        this.name=name;
    }
    // note here parameter vanthu same class oda type than eruku
    public  void SendMessage(String msg , User recipient){

        System.out.println(this.name +" sending"+msg+""+recipient.name);

    }



    String getname(){
        return name;
    }

}
