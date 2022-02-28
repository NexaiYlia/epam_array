package com.nexai.array.repository.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.repository.Specification;

public class IdSpecification implements Specification {
    private Long id;

    public IdSpecification(Long id) {
        this.id = id;
    }

    @Override
    public boolean specify(ArrayEntity arrayEntity) {
        boolean result = (arrayEntity.getIdArray() == id);
        return false;
    }
}
