package org.example.Structuralpatteren.DecoratorPattern.Goodcode;

abstract  class PizzaDecorator implements Pizza {
    // we are give pizza as an input that's why we are creating this variable
   protected Pizza decoratedPizza;


   // this objects comes from  specific decorators like
    // cheespizza or mushroom pizza
   public PizzaDecorator(Pizza pizza){
       this.decoratedPizza=pizza;

   }





}
