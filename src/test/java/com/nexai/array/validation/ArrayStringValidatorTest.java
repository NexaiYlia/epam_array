package com.nexai.array.validation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class ArrayStringValidatorTest {

    public static final ArrayStringValidator validator = new ArrayStringValidator();

    @DataProvider(name = "correct_data")
    public Object[][] createCorrectData() {
        Object[][] data = new Object[5][1];
        data[0] = new String[]{"1  2  3"};
        data[1] = new String[]{"- 2"};
        data[2] = new String[]{"2     4  -  7  -5"};
        data[3] = new String[]{"            "};
        data[4] = new String[]{""};
        return data;
    }

    @DataProvider(name = "incorrect_data")
    public Object[][] createIncorrectData() {
        Object[][] data = new String[7][1];
        data[0] = new String[]{"d"};
        data[1] = new String[]{"14j5; 12"};
        data[2] = new String[]{"14-  2; 99"};
        data[3] = new String[]{"77  5 -; 4"};
        data[4] = new String[]{"4, 5; 7"};
        data[5] = new String[]{"4 6 8"};
        data[6] = new String[]{"2.5  6; 8"};
        return data;
    }

    @Test(dataProvider = "correct_data")
    public void validateArrayStringLinePositiveTest(String line) {
        assertTrue(validator.validateArrayStringLine(line));
    }

    @Test(dataProvider = "incorrect_data")
    public void validateArrayStringLineNegativeTest(String line) {
        assertFalse(validator.validateArrayStringLine(line));
    }

    @Test
    public void validateArrayStringLineNullTest() {
        boolean actual = validator.validateArrayStringLine(null);
        assertFalse(actual);
    }
}

