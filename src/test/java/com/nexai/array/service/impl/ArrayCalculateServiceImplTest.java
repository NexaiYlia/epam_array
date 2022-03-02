package com.nexai.array.service.impl;

import com.nexai.array.entity.ArrayEntity;
import com.nexai.array.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayCalculateServiceImplTest {

    private final ArrayEntity arrayEntityBase = new ArrayEntity(new int[]{3, 5, -7, 11, 0});
    private final ArrayEntity arrayEntityNegative = new ArrayEntity(new int[]{3, 5, -7, 11, 0});
    private final ArrayEntity arrayEntityZero = new ArrayEntity(new int[]{3, 5, -7, 11, 0});
    private final ArrayEntity arrayEntityEmpty = new ArrayEntity(new int[0]);
    private ArrayCalculateServiceImpl service;

    @BeforeClass
    public void setUp() {
        service = new ArrayCalculateServiceImpl();
    }

    @Test
    public void calculateMaxElementOfArrayPositiveTest() throws ArrayException {
        int actual = service.calculateMaxElementOfArray(arrayEntityBase);
        int expected = 11;
        Assert.assertEquals(actual, expected);

    }

    @Test(expectedExceptions = ArrayException.class)
    public void calculateMaxElementOfArrayPositiveExeptionTest() throws ArrayException {
        service.calculateMaxElementOfArray(arrayEntityEmpty);
    }

    @Test
    public void calculateMinElementOfArrayNegativeTest() throws ArrayException {
        int actual = service.calculateMinElementOfArray(arrayEntityNegative);
        int expected = -243;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateMinElementOfArrayStreamTest() throws ArrayException {
        int actual = service.calculateMinElementOfArray(arrayEntityBase);
        int expected = -7;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateSumOfArrayElementsTest() throws ArrayException {
        int actual = service.calculateSumOfArrayElements(arrayEntityNegative);
        int expected = -302;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateSumOfArrayElementsStreamTest() throws ArrayException {
        int actual = service.calculateSumOfArrayElementsStream(arrayEntityNegative);
        int expected = -302;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = ArrayException.class)
    public void calculateSumOfArrayElementsStreamExeptionTest() throws ArrayException {
        service.calculateSumOfArrayElementsStream(arrayEntityEmpty);
    }

    @Test(expectedExceptions = ArrayException.class)
    public void calculateAverageValueOfArrayElementsTest() throws ArrayException {
        int actual = service.calculateSumOfArrayElements(arrayEntityEmpty);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateAverageValueOfArrayElementsStreamTest() throws ArrayException {
        double actual = service.calculateAverageValueOfArrayElementsStream(arrayEntityNegative);
        double expected = -75.5;
        Assert.assertEquals(actual, expected);
    }

    @AfterClass
    public void tierDown() {
        service = null;
    }
}
