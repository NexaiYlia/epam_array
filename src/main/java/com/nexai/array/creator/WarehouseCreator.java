package com.nexai.array.creator;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.entity.Warehouse;

import java.util.List;

public interface WarehouseCreator {
    Warehouse createWarehouse(List<ArrayEntity> arrayEntities);
}
