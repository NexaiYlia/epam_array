package com.nexai.array.validation;

import com.nexai.array.entity.ArrayEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayValidatorTest {
    private final ArrayEntity arrayEntityBase = new ArrayEntity(new int[]{3, 5, -7, 11, 0});
    private final ArrayEntity arrayEntityNegative = new ArrayEntity(new int[]{3, 5, -7, 11, 0});
    private final ArrayEntity arrayEntityZero = new ArrayEntity(new int[]{3, 5, -7, 11, 0});
    private final ArrayEntity arrayEntityEmpty = new ArrayEntity(new int[0]);
    ArrayValidator validator = new ArrayValidator();

    @Test
    public void validateArrayTest() {
        Assert.assertTrue(validator.validateArray(arrayEntityBase));
    }

    @Test
    public void validateArrayZeroTest() {
        Assert.assertTrue(validator.validateArray(arrayEntityZero));
    }

    @Test
    public void validateArrayNegTest() {
        Assert.assertTrue(validator.validateArray(arrayEntityNegative));
    }


    @Test
    public void validateArrayEmptyTest() {
        Assert.assertFalse(validator.validateArray(arrayEntityEmpty));
    }
}

