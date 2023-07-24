package org.gofpatterns.structural;

import org.gofpatterns.creational.Pizza;

public abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String display() {
        return pizza.display();
    }
}
