package org.gofpatterns.behavioral;

import java.util.ArrayList;
import java.util.List;

public class PizzaStore implements Observable {

    private List<NotifierObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(NotifierObserver observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(NotifierObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (NotifierObserver observer : observers) {
            observer.update(message);
        }
    }
}
