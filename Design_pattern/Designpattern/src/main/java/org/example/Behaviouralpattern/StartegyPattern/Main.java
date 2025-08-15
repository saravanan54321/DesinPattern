package org.example.Behaviouralpattern.StartegyPattern;

public class Main {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setStartegy(new CreditCard());
        paymentService.setStartegy(new DebitCard());
        paymentService.pay();
    }
}
