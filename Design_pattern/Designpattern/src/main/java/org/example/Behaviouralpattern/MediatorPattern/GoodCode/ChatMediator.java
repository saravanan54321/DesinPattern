package org.example.Behaviouralpattern.MediatorPattern.GoodCode;

public interface ChatMediator {

    void sendMessage(String msg,Chatuser user);

    void addUser(Chatuser user );
}
