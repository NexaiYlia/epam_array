package com.nexai.array.service.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.service.ArraySearchService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class ArraySearchServiceImpl implements ArraySearchService {
    private static final Logger logger = LogManager.getLogger(ArraySearchServiceImpl.class.getName());

    @Override
    public int findCountOfPositiveArrayElements(ArrayEntity arrayEntity) {
        logger.info("Find count of negative array elements" + arrayEntity.getArray());
        int[] array = arrayEntity.getArray();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public long findCountOfPositiveArrayElementsStream(ArrayEntity arrayEntity) {
        logger.info("Find count of negative array elements with Stream API" + arrayEntity.getArray());
        long count = IntStream.of(arrayEntity.getArray()).filter(w -> w > 0).count();
        return count;
    }

    @Override
    public int findCountOfNegativeArrayElements(ArrayEntity arrayEntity) {
        logger.info("Find count of negative array elements" + arrayEntity.getArray());
        int[] array = arrayEntity.getArray();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public long findCountOfNegativeArrayElementsStream(ArrayEntity arrayEntity) {
        logger.info("Find count of negative array elements with Stream API" + arrayEntity.getArray());
        long count = IntStream.of(arrayEntity.getArray()).filter(w -> w < 0).count();
        return count;
    }
}
