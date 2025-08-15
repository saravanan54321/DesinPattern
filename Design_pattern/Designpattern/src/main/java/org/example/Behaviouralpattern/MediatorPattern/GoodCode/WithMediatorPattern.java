package org.example.Behaviouralpattern.MediatorPattern.GoodCode;

import org.example.Behaviouralpattern.MediatorPattern.Badcode.User;

public class WithMediatorPattern {

    public static void main(String[] args) {
        // why it is implementing ChatMediator interface means
        // we can attach new chatroom  for that it is using
        ChatMediator cm = new ChatRoom();
        Chatuser a = new Chatuser("A",cm);
        Chatuser b = new Chatuser("B",cm);
        Chatuser c = new Chatuser("C",cm);

        cm.addUser(a);
        cm.addUser(b);
        cm.addUser(c);
        a.SendMessage("hi everyone");
    }
}
