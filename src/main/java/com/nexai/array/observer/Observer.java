package com.nexai.array.observer;

import com.nexai.array.exception.ArrayException;

import java.lang.reflect.Array;

public interface Observer {
    void parameterChanged(ArrayEvent event) ;
}
