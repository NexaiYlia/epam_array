package com.nexai.array.reader.impl;

import org.testng.annotations.DataProvider;
import java.util.ArrayList;
import java.util.List;

public class ArrayReaderImplTest {
    ArrayReaderImpl reader = new ArrayReaderImpl();

    @DataProvider(name = "data_files")
    public Object[][] createData() {
        List<String> linesFromFileWithOneCorrect = new ArrayList<>();
        linesFromFileWithOneCorrect.add(" ");
        linesFromFileWithOneCorrect.add("2; 125; 1; 8");
        linesFromFileWithOneCorrect.add("");
        linesFromFileWithOneCorrect.add("2;     125;     1; /8");
        linesFromFileWithOneCorrect.add("-2; !125; ; 8");
        List<String> emptyList = new ArrayList<>();

        Object[][] data = new Object[5][2];
        data[0] = new Object[]{
                this.getClass().getClassLoader().getResource("testArray.txt").toString().substring(6),
                linesFromFileWithOneCorrect
        };
        data[1] = new Object[]{
                this.getClass().getClassLoader().getResource("testArray.txt").toString().substring(6),
                linesFromFileWithOneCorrect
        };
        data[2] = new Object[]{
                this.getClass().getClassLoader().getResource("testArray.txt").toString().substring(6),
                linesFromFileWithOneCorrect
        };
        data[3] = new Object[]{
                this.getClass().getClassLoader().getResource("testArray.txt").toString().substring(6),
                linesFromFileWithOneCorrect
        };
        data[4] = new Object[]{
                this.getClass().getClassLoader().getResource("testArray.txt").toString().substring(6),
                linesFromFileWithOneCorrect
        };
        return data;
    }

//    public void readArrayFromFile() throws ArrayReaderException {
//
//    }
//
//    public void readAllArrayFromFileStream() throws ArrayReaderException{
//
//    }
}
