package com.nexai.array.repository.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.repository.Specification;

public class AllEvenArraySpecification implements Specification {
    @Override
    public boolean specify(ArrayEntity arrayEntity) {
        int[] array = arrayEntity.getArray();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        boolean result = (counter == array.length);
        return result;
    }
}
