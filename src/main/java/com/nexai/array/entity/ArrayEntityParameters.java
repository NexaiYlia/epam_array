package com.nexai.array.entity;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayEntityParameters {
    private OptionalInt maxElement;
    private OptionalInt minElement;
    private OptionalDouble averageValue;
    private OptionalInt elementsCount;

    public ArrayEntityParameters() {
    }

    public ArrayEntityParameters(int newMaxElement, int newMinElement, double newAverageValue, int newElementsCount) {
        maxElement = OptionalInt.of(newMaxElement);
        minElement = OptionalInt.of(newMinElement);
        averageValue = OptionalDouble.of(newAverageValue);
        elementsCount = OptionalInt.of(newElementsCount);
    }
}
