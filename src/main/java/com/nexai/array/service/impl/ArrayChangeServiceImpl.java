package com.nexai.array.service.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.service.ArrayChangeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayChangeServiceImpl implements ArrayChangeService {
    private static final Logger logger = LogManager.getLogger(ArrayChangeServiceImpl.class.getName());

    @Override
    public int[] replaceNegativeArrayValuesByZero(ArrayEntity arrayEntity) {
        logger.info("Replace negative array values by zero" + arrayEntity.getArray());
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
        logger.info("Replace even array values by two" + arrayEntity.getArray());
        int[] array = arrayEntity.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 2;
            }
        }
        return array;
    }
}
