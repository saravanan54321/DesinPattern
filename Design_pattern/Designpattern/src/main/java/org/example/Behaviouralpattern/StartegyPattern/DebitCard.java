package org.example.Behaviouralpattern.StartegyPattern;

public class DebitCard implements PaymentStartegy{
    @Override
    public void processPayment() {
        System.out.println("paying via debitcard");
    }
}
