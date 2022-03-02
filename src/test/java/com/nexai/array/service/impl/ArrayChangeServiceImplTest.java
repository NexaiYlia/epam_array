package com.nexai.array.service.impl;

import com.nexai.array.entity.ArrayEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayChangeServiceImplTest {
    private ArrayChangeServiceImpl service = new ArrayChangeServiceImpl();
    private final ArrayEntity arrayEntityBase = new ArrayEntity(new int[]{3, 5, -7, 11, 0});
    private final ArrayEntity arrayEntityNegative = new ArrayEntity(new int[]{3, 5, -7, 11, 0});
    private final ArrayEntity arrayEntityZero = new ArrayEntity(new int[]{3, 5, -7, 11, 0});
    private final ArrayEntity arrayEntityEmpty = new ArrayEntity(new int[0]);

    @Test
    public void replaceNegativeArrayValuesByZeroTest() {
        int[] actual = service.replaceNegativeArrayValuesByZero(arrayEntityNegative);
        int[] expected = {0, 0, 0, 0};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void replaceNegativeArrayValuesByZeroNullArrayTest() {
        int[] actual = service.replaceNegativeArrayValuesByZero(arrayEntityEmpty);
        int[] expected = {};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void replaceEvenArrayValuesByTwoTest() {
        int[] actual = service.replaceEvenArrayValuesByTwo(arrayEntityBase);
        int[] expected = {3, 5, -7, 2, 2};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void replaceEvenArrayValuesByTwoZeroArrayTest() {
        int[] actual = service.replaceEvenArrayValuesByTwo(arrayEntityZero);
        int[] expected = {2, 2, 2, 2, 2};
        Assert.assertEquals(actual, expected);
    }
}
