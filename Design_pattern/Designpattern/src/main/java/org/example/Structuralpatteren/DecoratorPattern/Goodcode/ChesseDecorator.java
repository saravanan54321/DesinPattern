package org.example.Structuralpatteren.DecoratorPattern.Goodcode;

public class ChesseDecorator extends PizzaDecorator {

        public ChesseDecorator(Pizza pizza){
              super(pizza);
           }

    public  String getDescription(){
        return decoratedPizza.getDescription() +"cheese";
    }

    public double getcost(){
        return decoratedPizza.getcost()+ 1.00;
    }
}
