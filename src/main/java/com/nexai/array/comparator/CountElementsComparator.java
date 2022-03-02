package com.nexai.array.comparator;

import com.nexai.array.entity.ArrayEntity;

import java.util.Comparator;

public class CountElementsComparator implements Comparator<ArrayEntity> {
    @Override
    public int compare(ArrayEntity o1, ArrayEntity o2) {
        int lengthO1 = o1.getArray().length;
        int lengthO2 = o2.getArray().length;
        int compare = Integer.compare(lengthO1, lengthO2);
        return compare;
    }
}
