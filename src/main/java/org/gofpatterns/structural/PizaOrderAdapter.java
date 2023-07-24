package org.gofpatterns.structural;

import org.gofpatterns.creational.Pizza;

public class PizaOrderAdapter implements Pizza {

    private PizzaOrder pizzaOrder;

    public PizaOrderAdapter(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public String display() {
        return "Order: " + pizzaOrder.getPizza().display() + " Price: EUR" + pizzaOrder.getPrice();
    }
}
