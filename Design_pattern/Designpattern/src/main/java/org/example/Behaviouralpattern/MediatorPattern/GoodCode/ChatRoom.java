package org.example.Behaviouralpattern.MediatorPattern.GoodCode;

import java.util.ArrayList;
import java.util.List;

// this class hold the users
// and call the receiver msg of of the respective reciver cls
public class ChatRoom implements  ChatMediator{

    List<Chatuser> users;
    ChatRoom(){
        this.users=new ArrayList<>();



    }
    // sender sends the msg to chatroom
    //chatroom contains all users .Looped the all users
    //and send the message the rescpective receiver
    @Override
    public void sendMessage(String msg, Chatuser sender) {

        for(Chatuser user : users){
            // condition for avoiding current user

            if(user!=sender){
            // calling chatuser receivers msg
            sender.receiveMsg(msg,user);
            }
        }

    }

    @Override
    public void addUser(Chatuser user) {
        users.add(user);
    }


}
