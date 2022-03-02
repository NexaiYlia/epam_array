package com.nexai.array.service.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.service.ArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySortServiceImpl implements ArraySortService {
    private static final Logger logger = LogManager.getLogger(ArraySortServiceImpl.class.getName());

    @Override
    public void bubbleSort(ArrayEntity arrayEntity) {
        logger.info("Array sorted by bubble" + arrayEntity.getArray());
        int[] array = arrayEntity.getArray();
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    change(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    @Override
    public void selectionSort(ArrayEntity arrayEntity) {
        logger.info("Array sorted by selection" + arrayEntity.getArray());
        int[] array = arrayEntity.getArray();
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            change(array, left, minInd);
        }
    }

    @Override
    public void insertionSort(ArrayEntity arrayEntity) {
        logger.info("Array sorted by insertion" + arrayEntity.getArray());
        int[] array = arrayEntity.getArray();
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {

                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    @Override
    public void arraySortStream(ArrayEntity arrayEntity) {
        logger.info("Array sorted with strem" + arrayEntity.getArray());
        int[] array = arrayEntity.getArray();
        IntStream stream = Arrays.stream(Arrays.stream(array).sorted().toArray());
    }

    private void change(int[] array, int ind1, int ind2) {
        int element = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = element;
    }
}

