package com.nexai.array.service.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.service.ArraySearchService;

public class ArraySearchServiceImpl implements ArraySearchService {
    @Override
    public int findCountOfPositiveArrayElements(ArrayEntity arrayEntity) {
        int[] array = arrayEntity.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }


    @Override
    public int findCountOfNegativeArrayElements(ArrayEntity arrayEntity) {
        int[] array = arrayEntity.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
