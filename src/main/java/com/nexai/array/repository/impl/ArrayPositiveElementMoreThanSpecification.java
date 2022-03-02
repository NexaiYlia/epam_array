package com.nexai.array.repository.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.repository.Specification;
import com.nexai.array.service.ArraySearchService;
import com.nexai.array.service.impl.ArraySearchServiceImpl;

public class ArrayPositiveElementMoreThanSpecification implements Specification {
    private Long countOfPositiveElements;


    public ArrayPositiveElementMoreThanSpecification(Long countOfPositiveElements) {
        this.countOfPositiveElements = countOfPositiveElements;
    }

    @Override
    public boolean specify(ArrayEntity arrayEntity) {
        ArraySearchService searchService = new ArraySearchServiceImpl();
        long count = searchService.findCountOfPositiveArrayElements(arrayEntity);
        boolean result = (count > countOfPositiveElements);

        return result;
    }
}
