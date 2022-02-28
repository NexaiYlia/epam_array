package com.nexai.array.entity;

import java.util.Map;

public class Warehouse {
    private static Warehouse instance;
    private Map<Long, ArrayEntityParameters> arrayMap;

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public ArrayEntityParameters put(Long key, ArrayEntityParameters value) {
        return arrayMap.put(key, value);
    }

    public ArrayEntityParameters remove(Object key) {
        return arrayMap.remove(key);
    }

    public ArrayEntityParameters get(Object key) {
        return arrayMap.get(key);
    }
}
