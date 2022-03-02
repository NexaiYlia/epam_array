package com.nexai.array.creator;

import com.nexai.array.entity.ArrayEntity;

import java.util.List;

public interface ArrayCreator {
    ArrayEntity createArrayEntity(int... array);

    ArrayEntity createEmptyArrayEntity();

    List<ArrayEntity> createListArrayEntityStream(List<int[]> arrays);
}
