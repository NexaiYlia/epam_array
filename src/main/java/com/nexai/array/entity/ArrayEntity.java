package com.nexai.array.entity;

import com.nexai.array.observer.impl.ArrayObserverImpl;
import com.nexai.array.util.IdGenerator;

import java.util.Arrays;
import java.util.Objects;

public class ArrayEntity extends ArrayEntityBase {
    private int[] array;
    private Long idArray;

    public ArrayEntity() {
        this.array = new int[0];
        this.idArray = IdGenerator.generateId();
        Warehouse.getInstance().put(idArray, new ArrayEntityParameters());
    }

    public ArrayEntity(int[] array) {
        this.array = array;
        this.idArray = IdGenerator.generateId();
        Warehouse.getInstance().put(idArray, new ArrayEntityParameters());
        attach(new ArrayObserverImpl());
        notifyObservers();
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = array;
        notifyObservers();
    }

    public long getIdArray() {
        return idArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayEntity that = (ArrayEntity) o;
        return Arrays.equals(array, that.array) && Objects.equals(idArray, that.idArray);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(idArray);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayEntity{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append(", idArray=").append(idArray);
        sb.append('}');
        return sb.toString();
    }
}
