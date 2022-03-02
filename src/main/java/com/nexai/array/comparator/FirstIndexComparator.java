package com.nexai.array.comparator;

import com.nexai.array.entity.ArrayEntity;

import java.util.Comparator;

public class FirstIndexComparator implements Comparator<ArrayEntity> {
    @Override
    public int compare(ArrayEntity o1, ArrayEntity o2) {
        int[] arrayO1 = o1.getArray();
        int[] arrayO2 = o2.getArray();
        int compare = Integer.compare(arrayO1[0], arrayO2[0]);
        return compare;
    }
}
