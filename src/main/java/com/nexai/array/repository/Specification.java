package com.nexai.array.repository;

import com.nexai.array.entity.ArrayEntity;

@FunctionalInterface
public interface Specification {
    boolean specify(ArrayEntity arrayEntity);
}
