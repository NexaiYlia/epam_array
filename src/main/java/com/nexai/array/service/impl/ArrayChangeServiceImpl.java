package com.nexai.array.service.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.service.ArrayChangeService;

public class ArrayChangeServiceImpl implements ArrayChangeService {
    @Override
    public int[] replaceNegativeArrayValuesByZero(ArrayEntity arrayEntity) {
        int[] array = arrayEntity.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    @Override
    public int[] replaceEvenArrayValuesByTwo(ArrayEntity arrayEntity) {
        int[] array = arrayEntity.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 2;
            }
        }
        return array;
    }
}
