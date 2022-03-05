package com.nexai.array.service.impl;

import com.nexai.array.entity.ArrayEntity;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArraySortServiceImplTest {
    private final ArrayEntity arrayEntityBase = new ArrayEntity(new int[]{3, 5, -7, 11, 0});
    private final ArrayEntity arrayEntityNegative = new ArrayEntity(new int[]{3, 5, -7, 11, 0});
    private final ArrayEntity arrayEntityZero = new ArrayEntity(new int[]{3, 5, -7, 11, 0});
    private final ArrayEntity arrayEntityEmpty = new ArrayEntity(new int[0]);
    private ArraySortServiceImpl service;

    @BeforeClass
    public void setUp() {
        service = new ArraySortServiceImpl();
    }


    @Test
    public void bubbleSortTest() {
        ArrayEntity expected = arrayEntityBase;
        service.bubbleSort(arrayEntityBase);
        Assert.assertEquals(arrayEntityBase, expected);
    }

    @Test
    public void selectionSortTest() {
        ArrayEntity expected = arrayEntityNegative;
        service.selectionSort(arrayEntityNegative);
        Assert.assertEquals(arrayEntityNegative, expected);
    }

    @Test
    public void insertionSortTest() {
        ArrayEntity expected = arrayEntityEmpty;
        service.insertionSort(arrayEntityEmpty);
        Assert.assertEquals(arrayEntityEmpty, expected);
    }


    @Test
    public void arraySortStreamTest() {
        service.arraySortStream(arrayEntityEmpty);
        ArrayEntity expected = arrayEntityEmpty;
        Assert.assertEquals(arrayEntityEmpty, expected);
    }

    @AfterClass
    public void tierDown() {
        service = null;
    }
}
