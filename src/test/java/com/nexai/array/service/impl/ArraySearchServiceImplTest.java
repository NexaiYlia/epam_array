package com.nexai.array.service.impl;

import com.nexai.array.entity.ArrayEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySearchServiceImplTest {
    private ArraySearchServiceImpl service = new ArraySearchServiceImpl();
    private final ArrayEntity arrayEntityBase = new ArrayEntity(3, 5, -7, 4, 0);
    private final ArrayEntity arrayEntityNegative = new ArrayEntity(-3, -55, -243, -1);
    private final ArrayEntity arrayEntityZero = new ArrayEntity(0, 0, 0, 0, 0);
    private final ArrayEntity arrayEntityEmpty = new ArrayEntity(new int[0]);

    @Test
    public void findCountOfPositiveArrayElementsTest() {
        int actual = service.findCountOfPositiveArrayElements(arrayEntityBase);
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findCountOfPositiveArrayElementsNegativeArrayTest() {
        int actual = service.findCountOfPositiveArrayElements(arrayEntityNegative);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findCountOfPositiveArrayElementsNullArrayTest() {
        int actual = service.findCountOfPositiveArrayElements(arrayEntityEmpty);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findCountOfPositiveArrayElementsStreamTest() {
        int actual = service.findCountOfPositiveArrayElements(arrayEntityZero);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findCountOfNegativeArrayElementsTest() {
        int actual = service.findCountOfNegativeArrayElements(arrayEntityZero);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findCountOfNegativeArrayElementsStreamTest() {
        long actual = service.findCountOfNegativeArrayElementsStream(arrayEntityNegative);
        long expected = 4;
        Assert.assertEquals(actual, expected);
    }

}
