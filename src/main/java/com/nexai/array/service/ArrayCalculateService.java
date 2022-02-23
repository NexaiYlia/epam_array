package com.nexai.array.service;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.exception.ArrayException;

public interface ArrayCalculateService {
    int calculateMaxIndexOfArray(ArrayEntity arrayEntity) throws ArrayException;

    int calculateMinIndexOfArray(ArrayEntity arrayEntity) throws ArrayException;

    int calculateSumOfArrayElements(ArrayEntity arrayEntity) throws ArrayException;

    double calculateAverageValueOfArrayElements(ArrayEntity arrayEntity) throws ArrayException;
}
