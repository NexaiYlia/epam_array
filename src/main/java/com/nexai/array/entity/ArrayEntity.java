package com.nexai.array.entity;

import com.nexai.array.util.IdGenerator;

import java.util.Arrays;
import java.util.Objects;

public class ArrayEntity {
    private int[] array;
    private Long idArray;

    public ArrayEntity() {
    }

    public ArrayEntity(int[] array) {
        this.array = array;
    }

    public ArrayEntity(int[] array, Long idArray) {
        this.array = array;
        this.idArray = IdGenerator.generateId();
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = array;
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
