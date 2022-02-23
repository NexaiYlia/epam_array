package com.nexai.array.service.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.exception.ArrayException;
import com.nexai.array.service.ArrayCalculateService;
import com.nexai.array.validation.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {

    private static final Logger logger = LogManager.getLogger(ArrayCalculateServiceImpl.class.getName());

    @Override
    public int calculateMaxIndexOfArray(ArrayEntity arrayEntity) throws ArrayException {
        int max;
        if (ArrayValidator.validateArray(arrayEntity)) {
            int[] array = arrayEntity.getArray();
            max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        } else {
            throw new ArrayException("This array is empty or null");
        }
        return max;
    }

    @Override
    public int calculateMinIndexOfArray(ArrayEntity arrayEntity) throws ArrayException {
        int min;
        if (ArrayValidator.validateArray(arrayEntity)) {
            int[] array = arrayEntity.getArray();
            min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        } else {
            throw new ArrayException("This array is empty or null");
        }
        return min;
    }

    @Override
    public int calculateSumOfArrayElements(ArrayEntity arrayEntity) throws ArrayException {
        int sum;
        if (ArrayValidator.validateArray(arrayEntity)) {
            int[] array = arrayEntity.getArray();
            sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        } else {
            throw new ArrayException("This array is empty or null");
        }
        return sum;
    }

    @Override
    public double calculateAverageValueOfArrayElements(ArrayEntity arrayEntity) throws ArrayException {
        if (!ArrayValidator.validateArray(arrayEntity)) {
            throw new ArrayException("This array is empty or null");
        }
        int[] array = arrayEntity.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum / array.length;
        return average;
    }
}

