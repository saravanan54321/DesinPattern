package org.example.Structuralpatteren.adapterpattern.GoodCode;

public class AdapterPattern implements NotificationService{


    SendGrid sg;

    AdapterPattern(SendGrid sg){
        this.sg=sg;
    }
    @Override
    public void send() {
        sg.sendingemail();
    }
}
