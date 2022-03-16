package com.nexai.array.observer;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.entity.ArrayEntityBase;

import java.util.EventObject;

public class ArrayEvent extends EventObject {

    public ArrayEvent(ArrayEntityBase source) {
        super(source);
    }

    @Override
    public ArrayEntity getSource() {
        return (ArrayEntity) super.getSource();
    }
}
