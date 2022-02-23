package com.nexai.array.creator.impl;

import com.nexai.array.creator.ArrayCreator;
import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.service.impl.ArrayCalculateServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCreatorImpl implements ArrayCreator {
    private static final Logger logger = LogManager.getLogger(ArrayCreatorImpl.class.getName());

    public ArrayEntity createArrayEntity(int... array) {
        logger.info("create new ArrayEntity");
        ArrayEntity arrayEntity = new ArrayEntity(array);
        return arrayEntity;
    }
}
