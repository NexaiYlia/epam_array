package com.nexai.array.service;

import com.nexai.array.entity.ArrayEntity;

public interface ArraySearchService {
    int findCountOfPositiveArrayElements(ArrayEntity arrayEntity);

    long findCountOfPositiveArrayElementsStream(ArrayEntity arrayEntity);

    int findCountOfNegativeArrayElements(ArrayEntity arrayEntity);

    long findCountOfNegativeArrayElementsStream(ArrayEntity arrayEntity);
}
