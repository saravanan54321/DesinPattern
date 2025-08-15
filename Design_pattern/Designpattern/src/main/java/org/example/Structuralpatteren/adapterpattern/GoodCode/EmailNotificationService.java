package org.example.Structuralpatteren.adapterpattern.GoodCode;



public class EmailNotificationService  implements NotificationService {


    @Override
    public void send() {
        System.out.println("Send email notifaction service");
    }
}
