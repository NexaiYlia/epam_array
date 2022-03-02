package com.nexai.array.repository.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.exception.ArrayException;
import com.nexai.array.repository.Specification;
import com.nexai.array.service.ArrayCalculateService;
import com.nexai.array.service.impl.ArrayCalculateServiceImpl;

public class  SumOfArrayBetweenTwoValueSpecification implements Specification {
    private Long minBorder;
    private Long maxBorder;

    public SumOfArrayBetweenTwoValueSpecification(Long minBorder, Long maxBorder) {
        this.minBorder = minBorder;
        this.maxBorder = maxBorder;
    }

    @Override
    public boolean specify(ArrayEntity arrayEntity) {
        boolean result = false;
        ArrayCalculateService arrayCalculateService = new ArrayCalculateServiceImpl();
        try {
            long sum = arrayCalculateService.calculateSumOfArrayElements(arrayEntity);
            result = (sum > minBorder && sum < maxBorder);
        } catch (ArrayException e) {
            e.printStackTrace();
        }
        return result;
    }
}

