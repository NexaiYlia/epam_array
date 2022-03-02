package com.nexai.array.creator;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.exception.ArrayException;

public interface ArrayRepositoryCreator {
    void addArrayToRepository(ArrayEntity arrayEntity) throws ArrayException;

    void addArrayToRepository(int... array) throws ArrayException;
}
