package com.nexai.array.parser.impl;

import com.nexai.array.parser.ArrayParser;

public class ArrayParserImpl implements ArrayParser {
    public static final String REGEX_FOR_SPLIT = "\\s+";

    @Override
    public int[] parseStringLine(String line) {
        String[] arrSplit = line.split(REGEX_FOR_SPLIT);
        int[] array = new int[arrSplit.length];
        for (int i = 0; i < arrSplit.length; i++) {
            array[i] = Integer.parseInt(arrSplit[i]);
        }
        return array;
    }
}
