package org.example.Structuralpatteren.adapterpattern.GoodCode;

//  If you adapter pattern you should use one class for connecting all those
// things
public class Client {

    public static void main(String[] args) {
        NotificationService ns = new AdapterPattern(new SendGrid()) ;
        ns.send();

    }}


