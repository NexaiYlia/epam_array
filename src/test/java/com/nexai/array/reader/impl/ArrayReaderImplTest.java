package com.nexai.array.reader.impl;


import com.nexai.array.exception.ArrayReaderException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class ArrayReaderImplTest {
    ArrayReaderImpl reader = new ArrayReaderImpl();

    static final String CORRECT_PATH = "src/main/test/java/resources/data/array.txt";
    static final String INCORRECT_PATH = "data/arraydata.txt";

    @Test(groups = "mainGroup")
    public void testReadFromFileWhenFilePathIsCorrect() throws ArrayReaderException {
        String actual = reader.readLineFromFile(CORRECT_PATH);
        String expected = "1 2 3";
        assertEquals(expected, actual);
    }

    @Test(groups = "arrayException")
    public void testReadFromFileWhenFilePathIsNotCorrect() {
        Assert.assertThrows(ArrayReaderException.class, () -> reader.readLineFromFile(INCORRECT_PATH));
    }

    @Test
    public void readAllLineFromFileStream() throws ArrayReaderException {
        List<String> actual = reader.readAllLineFromFileStream(CORRECT_PATH);
        List<String> expected = Arrays.asList("1,2,3", "4h,56,3,-1", " ", "5;1;-88");
        Assert.assertEquals(expected, actual);
    }
}




