package org.gofpatterns.creational;

public final class PizzaBuilder {

    private String baseType;
    private String sauce;
    private String toppings;

    private PizzaBuilder() {

    }

    public static PizzaBuilder aPizza() {
        return new PizzaBuilder();
    }

    public PizzaBuilder withBaseType(String baseType) {
        this.baseType = baseType;
        return this;
    }

    public PizzaBuilder withSauсe(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder withToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    public Pizza build() {
        return new PizzaSample(baseType, sauce, toppings);
    }
}
