package com.nexai.array.creator.impl;

import com.nexai.array.creator.ArrayCreator;
import com.nexai.array.creator.ArrayRepositoryCreator;
import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.exception.ArrayException;
import com.nexai.array.parser.ArrayParser;
import com.nexai.array.parser.impl.ArrayParserImpl;
import com.nexai.array.reader.ArrayReader;
import com.nexai.array.reader.impl.ArrayReaderImpl;
import com.nexai.array.repository.Repository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ArrayRepositoryCreatorImpl implements ArrayRepositoryCreator {
    private static final Logger logger = LogManager.getLogger(ArrayRepositoryCreatorImpl.class.getName());

    public Repository createRepository(String fileName) {
        ArrayReader reader = new ArrayReaderImpl();
        Repository repository = Repository.getInstance();
        try {
            List<String> lines = reader.readAllLineFromFile(fileName);
            ArrayParser parser = new ArrayParserImpl();
            List<int[]> arrays = parser.parseAllLineToString(lines);
            ArrayCreator creator = new ArrayCreatorImpl();
            List<ArrayEntity> arrayEntity = creator.createArrayEntity(arrays);
            repository.addAll(arrayEntity);
        } catch (ArrayException exception) {
            logger.error("Repository configuration exception", exception);
        }
        logger.info("Repository: " + repository + " created successfully");
        return repository;
    }

    @Override
    public void addArrayToRepository(ArrayEntity arrayEntity) {
        Repository repository = Repository.getInstance();
        repository.add(arrayEntity);
        logger.info("Array" + arrayEntity + "add to repository");
    }

    @Override
    public void addArrayToRepository(int... array)  {
        ArrayCreatorImpl creator = new ArrayCreatorImpl();
        ArrayEntity arrayEntity = creator.createArrayEntity(array);
        Repository repository = Repository.getInstance();
        repository.add(arrayEntity);
        logger.info("Array" + arrayEntity + "add to repository");
    }
}
