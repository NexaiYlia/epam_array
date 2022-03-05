package com.nexai.array.validation;

import com.nexai.array.exception.ArrayException;
import com.nexai.array.exception.ArrayReaderException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextFileValidatorTest {

    @Test
    public void validateTextFileTest(String fileName) throws ArrayReaderException {
        TextFileValidator validator = new TextFileValidator();
        Assert.assertTrue(validator.validateTextFile("src/main/test/java/resources/data/array.txt"));
    }

    @Test(expectedExceptions = ArrayException.class)
    public void validateTextFileExceptionTest(String fileName) throws ArrayReaderException {
        TextFileValidator validator = new TextFileValidator();
        Assert.assertTrue(validator.validateTextFile("resources/data/array.txt"));
    }
}