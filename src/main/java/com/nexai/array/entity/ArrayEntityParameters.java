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


    public OptionalInt getMaxElement() {
        return maxElement;
    }

    public void setMaxElement(OptionalInt maxElement) {
        this.maxElement = maxElement;
    }

    public OptionalInt getMinElement() {
        return minElement;
    }

    public void setMinElement(OptionalInt minElement) {
        this.minElement = minElement;
    }

    public OptionalDouble getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(OptionalDouble averageValue) {
        this.averageValue = averageValue;
    }

    public OptionalInt getElementsCount() {
        return elementsCount;
    }

    public void setElementsCount(OptionalInt elementsCount) {
        this.elementsCount = elementsCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayEntityParameters that = (ArrayEntityParameters) o;

        if (maxElement != null ? !maxElement.equals(that.maxElement) : that.maxElement != null) return false;
        if (minElement != null ? !minElement.equals(that.minElement) : that.minElement != null) return false;
        if (averageValue != null ? !averageValue.equals(that.averageValue) : that.averageValue != null) return false;
        return elementsCount != null ? elementsCount.equals(that.elementsCount) : that.elementsCount == null;
    }

    @Override
    public int hashCode() {
        int result = maxElement != null ? maxElement.hashCode() : 0;
        result = 31 * result + (minElement != null ? minElement.hashCode() : 0);
        result = 31 * result + (averageValue != null ? averageValue.hashCode() : 0);
        result = 31 * result + (elementsCount != null ? elementsCount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayEntityParameters{");
        sb.append("maxElement=").append(maxElement);
        sb.append(", minElement=").append(minElement);
        sb.append(", averageValue=").append(averageValue);
        sb.append(", elementsCount=").append(elementsCount);
        sb.append('}');
        return sb.toString();
    }
}
