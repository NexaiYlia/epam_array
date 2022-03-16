package com.nexai.array.observer.impl;

import com.nexai.array.entity.ArrayEntityBase;
import com.nexai.array.observer.ArrayEvent;
import com.nexai.array.observer.Observable;
import com.nexai.array.observer.Observer;

public class ArrayObservableImpl implements Observable {
    private Observer observer;

    @Override
    public void attach(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void detach(Observer observer) {
        this.observer = null;
    }

    @Override
    public void notifyObservers() {
        ArrayEvent event = new ArrayEvent((ArrayEntityBase) observer);
        if (observer != null) {
            observer.parameterChanged(event);
        }
    }
}


