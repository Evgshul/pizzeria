package org.gofpatterns.structural;

import org.gofpatterns.creational.Pizza;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String display() {
       return super.display().concat(addCheese());
    }

    private String addCheese() {
        return " + double cheese";
    }
}
