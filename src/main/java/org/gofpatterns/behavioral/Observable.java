package org.gofpatterns.behavioral;

public interface Observable {

    void registerObserver(NotifierObserver observer);
    void removeObserver(NotifierObserver observer);
    void notifyObservers(String message);


}
