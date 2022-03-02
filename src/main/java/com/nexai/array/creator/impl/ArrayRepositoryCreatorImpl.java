package com.nexai.array.creator.impl;

import com.nexai.array.creator.ArrayRepositoryCreator;
import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.exception.ArrayException;
import com.nexai.array.repository.Repository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayRepositoryCreatorImpl implements ArrayRepositoryCreator {
    private static final Logger logger = LogManager.getLogger(ArrayRepositoryCreatorImpl.class.getName());

    @Override
    public void addArrayToRepository(ArrayEntity arrayEntity) throws ArrayException {
        Repository repository = Repository.getInstance();
        repository.add(arrayEntity);
        logger.info("Array" + arrayEntity + "add to repository");
    }

    @Override
    public void addArrayToRepository(int... array) throws ArrayException {
        ArrayCreatorImpl creator = new ArrayCreatorImpl();
        ArrayEntity arrayEntity = creator.createArrayEntity(array);
        Repository repository = Repository.getInstance();
        repository.add(arrayEntity);
        logger.info("Array" + arrayEntity + "add to repository");
    }
}
