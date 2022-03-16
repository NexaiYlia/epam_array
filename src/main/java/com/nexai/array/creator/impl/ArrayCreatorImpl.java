package com.nexai.array.creator.impl;

import com.nexai.array.creator.ArrayCreator;
import com.nexai.array.entity.ArrayEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayCreatorImpl implements ArrayCreator {
    private static final Logger logger = LogManager.getLogger(ArrayCreatorImpl.class.getName());

    @Override
    public ArrayEntity createArrayEntity(int... array) {
        logger.info("create new ArrayEntity");
        ArrayEntity arrayEntity = new ArrayEntity(array);
        return array != null ? new ArrayEntity(array) : new ArrayEntity();
    }

    @Override
    public ArrayEntity createEmptyArrayEntity() {
        logger.info("create new  empty ArrayEntity");
        return new ArrayEntity();

    }

    @Override
    public List<ArrayEntity> createArrayEntity(List<int[]> arraysElements) {
        logger.info("create new CustomArray");
        List<ArrayEntity> customArrays = new ArrayList<>();
        if (arraysElements == null) {
            return customArrays;
        }
        ArrayEntity arrayEntity;
        for (int[] elements : arraysElements) {
            arrayEntity = createArrayEntity(elements);
            customArrays.add(arrayEntity);
        }
        return customArrays;
    }

    @Override
    public List<ArrayEntity> createListArrayEntityStream(List<int[]> arrays) {
        logger.info("create new ArrayEntity");
        return arrays.stream()
                .map(this::createArrayEntity)
                .collect(Collectors.toList());
    }
}




