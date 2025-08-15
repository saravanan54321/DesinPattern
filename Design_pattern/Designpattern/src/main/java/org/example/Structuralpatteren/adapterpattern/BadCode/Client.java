package org.example.Structuralpatteren.adapterpattern.BadCode;

public class Client {

    public static void main(String[] args) {
        NotificationService ns = new EmailNotificationService() ;
        ns.send();

}}

