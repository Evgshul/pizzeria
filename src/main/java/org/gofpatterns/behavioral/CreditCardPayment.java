package org.gofpatterns.behavioral;

/**
 * Concrete Strategy
 */
public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        // logic for payment with card

        System.out.println("Paid $" + amount + " using Credit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}
