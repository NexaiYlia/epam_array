package com.nexai.array.service;

import com.nexai.array.entity.ArrayEntity;

public interface ArrayChangeService {

    int[] replaceNegativeArrayValuesByZero(ArrayEntity arrayEntity);

    int[] replaceEvenArrayValuesByTwo(ArrayEntity arrayEntity);
}
