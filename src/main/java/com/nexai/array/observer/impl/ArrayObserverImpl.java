package com.nexai.array.observer.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.entity.ArrayEntityParameters;
import com.nexai.array.entity.Warehouse;
import com.nexai.array.exception.ArrayException;
import com.nexai.array.observer.ArrayEvent;
import com.nexai.array.observer.Observer;
import com.nexai.array.service.ArrayCalculateService;
import com.nexai.array.service.impl.ArrayCalculateServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayObserverImpl implements Observer {
    private static final Logger logger = LogManager.getLogger(ArrayObserverImpl.class.getName());

    @Override
    public void parameterChanged(ArrayEvent event) {
        ArrayEntity arrayEntity = event.getSource();
        long id = arrayEntity.getIdArray();
        try {
            ArrayCalculateService calculateService = new ArrayCalculateServiceImpl();
            int maxElement = calculateService.calculateMaxElementOfArray(arrayEntity);
            int minElement = 0;
            minElement = calculateService.calculateMinElementOfArray(arrayEntity);
            double averageValue = calculateService.calculateAverageValueOfArrayElements(arrayEntity);
            int elementsCount = arrayEntity.getArray().length;
            ArrayEntityParameters parameters = new ArrayEntityParameters(maxElement, minElement, averageValue, elementsCount);
            Warehouse warehouse = Warehouse.getInstance();
            warehouse.put(id, parameters);
            logger.info("Create Warehouse with parameters" + parameters);
        } catch (ArrayException e) {
            logger.error("Create Warehouse with parameters is failed ", e);
        }
    }
}
