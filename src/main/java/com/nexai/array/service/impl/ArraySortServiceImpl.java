package com.nexai.array.service.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.service.ArraySortService;

public class ArraySortServiceImpl implements ArraySortService {

    @Override
    public void bubbleSort(ArrayEntity arrayEntity) {
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

    private void change(int[] array, int ind1, int ind2) {
        int element = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = element;
    }
}

