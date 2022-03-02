package com.nexai.array.creator.impl;

import com.nexai.array.creator.WarehouseCreator;
import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.entity.ArrayEntityParameters;
import com.nexai.array.entity.Warehouse;
import com.nexai.array.exception.ArrayException;
import com.nexai.array.service.impl.ArrayCalculateServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class WarehouseCreatorImpl implements WarehouseCreator {
    private static final Logger logger = LogManager.getLogger(WarehouseCreatorImpl.class.getName());

    public Warehouse createWarehouse(List<ArrayEntity> arrayEntities) {
        Warehouse warehouse = Warehouse.getInstance();
        ArrayCalculateServiceImpl service = new ArrayCalculateServiceImpl();
        for (ArrayEntity arrayEntity : arrayEntities) {
            try {
                int maxElement = service.calculateMaxElementOfArray(arrayEntity);
                int minElement = service.calculateMinElementOfArray(arrayEntity);
                double averageValue = service.calculateAverageValueOfArrayElements(arrayEntity);
                int elementsCount = arrayEntity.getArray().length;
                ArrayEntityParameters parameters = new ArrayEntityParameters(maxElement, minElement, averageValue, elementsCount);
                long id = arrayEntity.getIdArray();
                warehouse.put(id, parameters);
            } catch (ArrayException e) {
                logger.error("Error in data. Parameters didn't add" + arrayEntity, e);
            }
        }
        logger.info("Parameters successfully add");
        return warehouse;
    }
}
