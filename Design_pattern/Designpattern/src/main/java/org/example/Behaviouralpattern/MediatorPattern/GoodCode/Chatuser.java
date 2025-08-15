package org.example.Behaviouralpattern.MediatorPattern.GoodCode;


// use this class for both sender and receiver
public class Chatuser {

    String name;

    ChatMediator chatMediator;

    Chatuser(String name,ChatMediator chatMediator){
        this.name=name;
        this.chatMediator=chatMediator;
    }

    String getname(){
        return name;
    }

    public  void SendMessage(String msg ){

        System.out.println(this.name + " sending"+msg );
        chatMediator.sendMessage(msg,this);

    }

   void  receiveMsg(String msg ,Chatuser user){
       System.out.println(user.getname()  + " received "+msg+" from "+  this.getname());

   }

}
