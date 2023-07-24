package org.gofpatterns.creational;


/**
 * Creational Pattern: Builder
 * <p>
 * Product
 */
public class PizzaSample implements Pizza{

    private String baseType;
    private String sauce;
    private String toppings;

    /**
     * Constructor that creates our immutable Pizza object.
     *
     * @param baseType
     * @param sauce
     * @param toppings
     */
    public PizzaSample(String baseType, String sauce, String toppings) {
        this.baseType = baseType;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public String getBaseType() {
        return baseType;
    }

    public String getSauce() {
        return sauce;
    }

    public String getToppings() {
        return toppings;
    }


    // Pizza display method
    @Override
    public String display() {
        return "Pizza with " + baseType + " base type, " + sauce + " sauce, and " + toppings + " toppings";
    }
}
