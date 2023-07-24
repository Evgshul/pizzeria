package org.gofpatterns.behavioral;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        // Logic for cash payment
        System.out.println("Paid $" + amount + " in cash");
    }
}
