package org.example.Structuralpatteren.FacadePattern.goodCode;

public class Client {


    public static void main(String[] args) {
        Apigateway ap = new Apigateway();
        ap.getFullDetials();
    }
}
