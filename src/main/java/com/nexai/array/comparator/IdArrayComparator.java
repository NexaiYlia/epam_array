package com.nexai.array.comparator;

import com.nexai.array.entity.ArrayEntity;

import java.util.Comparator;

public class IdArrayComparator implements Comparator<ArrayEntity> {
    @Override
    public int compare(ArrayEntity o1, ArrayEntity o2) {
        int compare = Long.compare(o1.getIdArray(), o2.getIdArray());
        return compare;
    }
}
