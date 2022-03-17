package com.nexai.array.creator;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.exception.ArrayException;
import com.nexai.array.repository.Repository;

public interface ArrayRepositoryCreator {
    Repository createRepository(String fileName);

    void addArrayToRepository(ArrayEntity arrayEntity) throws ArrayException;

    void addArrayToRepository(int... array) throws ArrayException;
}
