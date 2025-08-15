package org.example.Structuralpatteren.DecoratorPattern.Goodcode;

public class PizzaApp {


    public static void main(String[] args) {

        // creating one base pizza
        Pizza pizza = new BasePizza();
        // with base pizza adding topings on it
        pizza = new ChesseDecorator(pizza);
//        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getcost());
    }
}
