package org.lbms.app.observer;

public interface Subject {

    void addObserver(Observer observer);

    void notifyObservers(String message);

}