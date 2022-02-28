package com.nexai.array.repository;

import com.nexai.array.entity.ArrayEntity;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repository {

    private static Repository instance;
    private List<ArrayEntity> arrayEntityList;

    private Repository() {
    }

    public static Repository getInstance() {
        return instance;
    }

    public List<ArrayEntity> getArrayEntityList() {
        return arrayEntityList;
    }

    public void setArrayEntityList(List<ArrayEntity> arrayEntityList) {
        this.arrayEntityList = arrayEntityList;
    }

    public boolean add(ArrayEntity arrayEntity) {
        return arrayEntityList.add(arrayEntity);
    }

    public boolean addAll(Collection<? extends ArrayEntity> c) {
        return arrayEntityList.addAll(c);
    }

    public boolean remove(Object o) {
        return arrayEntityList.remove(o);
    }

    public boolean removeAll(Collection<?> c) {
        return arrayEntityList.removeAll(c);
    }

    public ArrayEntity get(int index) {
        return arrayEntityList.get(index);
    }

    public ArrayEntity set(int index, ArrayEntity element) {
        return arrayEntityList.set(index, element);
    }

    public List<ArrayEntity> query(Specification specification) {
        List<ArrayEntity> list = arrayEntityList.stream().filter(o -> specification.specify(o)).collect(Collectors.toList());
        return list;
    }

    public List<ArrayEntity> query(Predicate<ArrayEntity> specification) {
        List<ArrayEntity> list = arrayEntityList.stream().filter(o -> specification.test(o)).collect(Collectors.toList());
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Repository that = (Repository) o;

        return arrayEntityList != null ? arrayEntityList.equals(that.arrayEntityList) : that.arrayEntityList == null;
    }

    @Override
    public int hashCode() {
        return arrayEntityList != null ? arrayEntityList.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Repository{");
        sb.append("arrayEntityList=").append(arrayEntityList);
        sb.append('}');
        return sb.toString();
    }
}
