package com.nexai.array.repository.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.repository.Specification;

public class IdBetweenSpecification implements Specification {
    private Long minBorder;
    private Long maxBorder;

    public IdBetweenSpecification(Long minBorder, Long maxBorder) {
        this.minBorder = minBorder;
        this.maxBorder = maxBorder;
    }

    @Override
    public boolean specify(ArrayEntity arrayEntity) {
        boolean result = (arrayEntity.getIdArray() > minBorder && arrayEntity.getIdArray() < maxBorder);
        return result;
    }
}
