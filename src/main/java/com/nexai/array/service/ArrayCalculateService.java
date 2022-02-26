package com.nexai.array.service;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.exception.ArrayException;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface ArrayCalculateService {
    int calculateMaxElementOfArray(ArrayEntity arrayEntity) throws ArrayException;

    int calculateMaxElementOfArrayStream(ArrayEntity arrayEntity) throws ArrayException;

    int calculateMinElementOfArray(ArrayEntity arrayEntity) throws ArrayException;

    int calculateMinElementOfArrayStream(ArrayEntity arrayEntity) throws ArrayException;

    int calculateSumOfArrayElements(ArrayEntity arrayEntity) throws ArrayException;

    int calculateSumOfArrayElementsStream(ArrayEntity arrayEntity) throws ArrayException;

    double calculateAverageValueOfArrayElements(ArrayEntity arrayEntity) throws ArrayException;

    double calculateAverageValueOfArrayElementsStream(ArrayEntity arrayEntity) throws ArrayException;
}
