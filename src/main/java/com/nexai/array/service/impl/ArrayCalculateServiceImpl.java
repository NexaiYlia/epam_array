package com.nexai.array.service.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.exception.ArrayException;
import com.nexai.array.service.ArrayCalculateService;
import com.nexai.array.validation.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {

    private static final Logger logger = LogManager.getLogger(ArrayCalculateServiceImpl.class.getName());

    @Override
    public int calculateSumElementOfArray(ArrayEntity arrayEntity) throws ArrayException {
        logger.info("Calculate sum elements of array" + Arrays.toString(arrayEntity.getArray()));
        int sum;
        if (ArrayValidator.validateArray(arrayEntity)) {
            int[] array = arrayEntity.getArray();
            sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
        } else {
            logger.error("This array is empty or null");
            throw new ArrayException("This array is empty or null");
        }
        return sum;
    }

    @Override
    public int calculateMaxElementOfArray(ArrayEntity arrayEntity) throws ArrayException {
        logger.info("Calculate max element of array" + Arrays.toString(arrayEntity.getArray()));
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
            logger.error("This array is empty or null");
            throw new ArrayException("This array is empty or null");
        }
        return max;
    }

    @Override
    public int calculateMaxElementOfArrayStream(ArrayEntity arrayEntity) throws ArrayException {
        logger.info("Calculate max element of array with Stream API" + Arrays.toString(arrayEntity.getArray()));
        if (!ArrayValidator.validateArray(arrayEntity)) {
            logger.error("This array is empty or null");
            throw new ArrayException("This array is empty or null");
        }
        OptionalInt maxOptional = IntStream.of(arrayEntity.getArray())
                .max();
        int max = maxOptional.getAsInt();

        return max;
    }


    @Override
    public int calculateMinElementOfArray(ArrayEntity arrayEntity) throws ArrayException {
        logger.info("Calculate min element of array" + Arrays.toString(arrayEntity.getArray()));
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
            logger.error("This array is empty or null");
            throw new ArrayException("This array is empty or null");
        }
        return min;
    }

    @Override
    public int calculateMinElementOfArrayStream(ArrayEntity arrayEntity) throws ArrayException {
        logger.info("Calculate min element of array with Stream API" + Arrays.toString(arrayEntity.getArray()));

        if (!ArrayValidator.validateArray(arrayEntity)) {
            logger.error("This array is empty or null");
            throw new ArrayException("This array is empty or null");
        }
        OptionalInt minOptional = IntStream.of(arrayEntity.getArray())
                .min();
        int min = minOptional.getAsInt();
        return min;
    }

    @Override
    public int calculateSumOfArrayElements(ArrayEntity arrayEntity) throws ArrayException {
        logger.info("Calculate sum of array elements" + Arrays.toString(arrayEntity.getArray()));
        int sum;
        if (ArrayValidator.validateArray(arrayEntity)) {
            int[] array = arrayEntity.getArray();
            sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        } else {
            logger.error("This array is empty or null");
            throw new ArrayException("This array is empty or null");
        }
        return sum;
    }

    @Override
    public int calculateSumOfArrayElementsStream(ArrayEntity arrayEntity) throws ArrayException {
        logger.info("Calculate sum of array elements with Stream API" + Arrays.toString(arrayEntity.getArray()));
        if (!ArrayValidator.validateArray(arrayEntity)) {
            logger.error("This array is empty or null");
            throw new ArrayException("This array is empty or null");
        }
        int count = IntStream.of(arrayEntity.getArray())
                .sum();
        return count;
    }


    @Override
    public double calculateAverageValueOfArrayElements(ArrayEntity arrayEntity) throws ArrayException {
        logger.info("Calculate average value of array elements" + Arrays.toString(arrayEntity.getArray()));
        if (!ArrayValidator.validateArray(arrayEntity)) {
            logger.error("This array is empty or null");
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

    @Override
    public double calculateAverageValueOfArrayElementsStream(ArrayEntity arrayEntity) throws ArrayException {
        logger.info("Calculate average value of array elements with Stream API" + Arrays.toString(arrayEntity.getArray()));
        if (!ArrayValidator.validateArray(arrayEntity)) {
            logger.error("This array is empty or null");
            throw new ArrayException("This array is empty or null");
        }
        OptionalDouble averageOptional = IntStream.of(arrayEntity.getArray()).average();
        double average = averageOptional.getAsDouble();
        return average;
    }
}

