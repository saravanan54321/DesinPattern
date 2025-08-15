package org.example.Structuralpatteren.DecoratorPattern.Goodcode;

public class MushroomDecorator extends PizzaDecorator {

    public MushroomDecorator(Pizza pizza){
        super(pizza);
    }

    public  String getDescription(){
        return decoratedPizza.getDescription() +"Mushroom";
    }

    public double getcost(){
        return decoratedPizza.getcost()+ 2.00;
    }
}
