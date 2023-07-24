package org.gofpatterns;

import org.gofpatterns.behavioral.*;
import org.gofpatterns.creational.Pizza;
import org.gofpatterns.creational.PizzaBuilder;
import org.gofpatterns.structural.CheeseDecorator;
import org.gofpatterns.structural.PizaOrderAdapter;
import org.gofpatterns.structural.PizzaOrder;

public class Main {
    public static void main(String[] args) {

        // Creational: Builder

        Pizza peperoniPizza = PizzaBuilder
                .aPizza()
                .withBaseType("thin")
                .withSauсe("spicy tomato")
                .withToppings("pepperoni, jalapenos, and cheese")
                .build();

        Pizza hawaiianPizza = PizzaBuilder
                .aPizza()
                .withBaseType("thick")
                .withSauсe("mild tomato")
                .withToppings("ham, pineapple, and cheese")
                .build();

        System.out.println(peperoniPizza.display());
        System.out.println(hawaiianPizza.display());

        // Structural, Decorator
        Pizza decoratedPizzaPiperoni = new CheeseDecorator(peperoniPizza);
        System.out.println(decoratedPizzaPiperoni.display());

        // Adapter
        PizzaOrder order = new PizzaOrder(hawaiianPizza, 19.98);
        PizaOrderAdapter orderAdapter = new PizaOrderAdapter(order);
        System.out.println(orderAdapter.display());

        // Behavioral: Observer
        PizzaStore pizzaStore = new PizzaStore();
        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Alice");
        pizzaStore.registerObserver(customer1);
        pizzaStore.registerObserver(customer2);

        // Behavioral: Strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        PaymentStrategy cashPayment = new CashPayment();

        // Execute the commands
        decoratedPizzaPiperoni.display();
        orderAdapter.display();

        // Notify customers when the pizzas are ready
        pizzaStore.notifyObservers("Your pizzas are ready!");

        // Pay using different payment methods
        double totalPrice = 25.98;
        creditCardPayment.pay(totalPrice);
        cashPayment.pay(totalPrice);
    }
}

