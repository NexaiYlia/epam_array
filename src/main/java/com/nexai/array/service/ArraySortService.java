package com.nexai.array.service;

import com.nexai.array.entity.ArrayEntity;

public interface ArraySortService {
    void bubbleSort(ArrayEntity arrayEntity);

    void selectionSort(ArrayEntity arrayEntity);

    void insertionSort(ArrayEntity arrayEntity);

    void arraySortStream(ArrayEntity arrayEntity);
}
