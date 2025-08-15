package org.example.Behaviouralpattern.MediatorPattern.Badcode;

public class WithoutMediatorPattern {

    public static void main(String[] args) {
        User a = new User("A");
        User b = new User("B");
        User c = new User("C");
        // here the user a should know about all user b,c
        // in future any new user added a should know about them also
        a.SendMessage("Hello every one ",b);
        a.SendMessage("Hello every one ",c);

    }




}
