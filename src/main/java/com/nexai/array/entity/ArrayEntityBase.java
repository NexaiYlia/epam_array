package com.nexai.array.entity;

import com.nexai.array.observer.ArrayEvent;
import com.nexai.array.observer.Observable;
import com.nexai.array.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ArrayEntityBase implements Observable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        ArrayEvent event = new ArrayEvent(this);

        if (!observers.isEmpty()) {
            for (Observer observer : observers) {
                observer.parameterChanged(event);
            }
        }
    }
}
