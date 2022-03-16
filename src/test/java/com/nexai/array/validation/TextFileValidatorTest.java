package com.nexai.array.validation;

import com.nexai.array.exception.ArrayReaderException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextFileValidatorTest {

    @Test
    public void validateTextFileTest() throws ArrayReaderException {
        TextFileValidator validator = new TextFileValidator();
        Assert.assertTrue(validator.validateTextFile("array.txt"));
    }

    @Test
    public void validateTextFileExceptionTest() throws ArrayReaderException {
        TextFileValidator validator = new TextFileValidator();
        Assert.assertTrue(validator.validateTextFile("array1.txt"));
    }
}