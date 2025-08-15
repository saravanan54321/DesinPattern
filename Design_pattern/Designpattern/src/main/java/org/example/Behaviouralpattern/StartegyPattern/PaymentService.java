package org.example.Behaviouralpattern.StartegyPattern;

public class PaymentService {

    private PaymentStartegy startegy;


    public void setStartegy(PaymentStartegy startegy){
        this.startegy=startegy;
    }

    public void pay(){
        startegy.processPayment();
    }
}
