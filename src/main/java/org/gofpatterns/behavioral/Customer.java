package org.gofpatterns.behavioral;

public class Customer implements NotifierObserver {

    private String customerName;

    public Customer(String name) {
        this.customerName = name;
    }

    @Override
    public String update(String message) {
        return customerName + ": " + message;
    }
}
