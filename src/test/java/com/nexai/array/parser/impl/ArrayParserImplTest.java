package com.nexai.array.parser.impl;

import com.nexai.array.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class ArrayParserImplTest {
    public static final ArrayParserImpl parser = new ArrayParserImpl();

    @DataProvider(name = "parse_data")
    public Object[][] createParseData() {
        Object[][] data = new Object[6][2];
        data[0] = new Object[]{
                "0 -88 9 11 4",
                new int[]{0, -88, 9, 11, 4}
        };
        data[1] = new Object[]{
                "   14   -  100     0    ",
                new int[]{14, -100, 0}
        };
        data[2] = new Object[]{
                "- 65",
                new int[]{-78}
        };
        data[3] = new Object[]{
                "8",
                new int[]{44}
        };
        data[4] = new Object[]{
                "",
                new int[0]
        };
        data[5] = new Object[]{
                "      ",
                new int[0]
        };
        return data;
    }

    @DataProvider(name = "parseAll_data")
    public Object[][] createParseAllData() {
        Object[][] data = new Object[2][2];
        data[0] = new Object[]{
                createLinesList(),
                createArraysList()
        };
        data[1] = new Object[]{
                new ArrayList<String>(),
                new ArrayList<int[]>()
        };
        return data;
    }

    @DataProvider(name = "parse_data_for_stream")
    public Object[][] createParseDataForStream() {
        Object[][] data = new Object[6][2];
        data[0] = new Object[]{
                "0 -88 9 11 4",
                new int[]{0, -88, 9, 11, 4}
        };
        data[1] = new Object[]{
                "   14 -  100   0    ",
                new int[]{14, -100, 0}
        };
        data[2] = new Object[]{
                "- 65",
                new int[]{-78}
        };
        data[3] = new Object[]{
                "8",
                new int[]{44}
        };
        data[4] = new Object[]{
                "",
                new int[0]
        };
        data[5] = new Object[]{
                "      ",
                new int[0]
        };
        return data;
    }

    @DataProvider(name = "parseAllStream_data")
    public Object[][] createParseAllStreamData() {
        Object[][] data = new Object[2][2];
        data[0] = new Object[]{
                createLinesList(),
                createArraysList()
        };
        data[1] = new Object[]{
                new ArrayList<String>(),
                new ArrayList<int[]>()
        };
        return data;
    }

    public List<String> createLinesList() {
        List<String> lines = new ArrayList<>();
        lines.add("4 -5 -3 14 4");
        lines.add("   14  -  100    0    ");
        lines.add("- 78");
        lines.add("44");
        lines.add("");
        lines.add("      ");
        return lines;
    }

    public List<int[]> createArraysList() {
        List<int[]> arrays = new ArrayList<>();
        arrays.add(new int[]{4, -5, -3, 14, 4});
        arrays.add(new int[]{14, -100, 0});
        arrays.add(new int[]{-78});
        arrays.add(new int[]{44});
        arrays.add(new int[0]);
        arrays.add(new int[0]);
        return arrays;
    }

    @Test
    public void parseStringLineToArrayOfIntTest() throws ArrayException {
        int[] expected = new int[]{1, 2, 3, 4, 5};
        int[] actual = parser.parseStringLineToArrayOfInt("1 2 3 4 5");
        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "parse_data")
    public void parseStringLineToArrayOfIntTest(String line, int[] expected) throws ArrayException {
        int[] actual = parser.parseStringLineToArrayOfInt(line);
        assertEquals(expected, actual);
    }

    @Test(dataProvider = "parseAll_data")
    public void parseAllLineToStringTest(List<String> lines, List<int[]> expected) throws ArrayException {
        List<int[]> actual = parser.parseAllLineToString(lines);
        assertEquals(expected, actual);
    }


    @Test
    public void parseStringLineToArrayOfIntStreamTest() {
        int[] expected = new int[]{1, 2, 3, 4, 5};
        int[] actual = parser.parseStringLineToArrayOfIntStream("1 2 3 4 5");
        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "parseAllStream_data")
    public void parseAllStreamTest(List<String> lines, List<int[]> expected) {
        List<int[]> actual = parser.parseAllStream(lines);
        assertEquals(expected, actual);
    }
}



