package org.gofpatterns.structural;


import org.gofpatterns.creational.Pizza;

public class PizzaOrder {

    private Pizza pizza;
    private double price;

    public PizzaOrder(Pizza pizza, double price) {
        this.pizza = pizza;
        this.price = price;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public double getPrice() {
        return price;
    }
}
