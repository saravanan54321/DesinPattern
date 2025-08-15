package org.example.Structuralpatteren.DecoratorPattern.Goodcode;

public class BasePizza implements Pizza{


    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getcost() {
        return 5.00;
    }
}
