package com.nexai.array.repository.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.repository.Specification;

public class ArrayLengthEqualsSpecification implements Specification {
    private int lengthToCompare;

    public ArrayLengthEqualsSpecification(int lengthToCompare) {
        this.lengthToCompare = lengthToCompare;
    }

    @Override
    public boolean specify(ArrayEntity arrayEntity) {
        boolean result = (arrayEntity.getArray().length == lengthToCompare);
        return false;
    }
}
