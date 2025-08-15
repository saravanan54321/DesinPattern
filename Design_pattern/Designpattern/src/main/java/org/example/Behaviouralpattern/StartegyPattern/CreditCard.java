package org.example.Behaviouralpattern.StartegyPattern;

public class CreditCard implements PaymentStartegy{
    @Override
    public void processPayment() {
        System.out.println("Paying via creditcard");
    }
}
