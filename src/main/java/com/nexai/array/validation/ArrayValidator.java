package com.nexai.array.validation;

import com.nexai.array.entity.ArrayEntity;

public class ArrayValidator {

    public static boolean validateArray(ArrayEntity arrayEntity) {
        int[] array = arrayEntity.getArray();
        boolean result = true;
        if (array.length == 0 || array == null) {
            result = false;
        }
        return result;
    }

}
