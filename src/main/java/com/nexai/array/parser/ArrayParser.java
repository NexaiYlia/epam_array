package com.nexai.array.parser;

import com.nexai.array.exception.ArrayException;

import java.util.List;

public interface ArrayParser {
    int[] parseStringLineToArrayOfInt(String line) throws ArrayException;

    List<int[]> parseAllLineToString(List<String> lines) throws ArrayException;

    int[] parseStringLineToArrayOfIntStream(String line);

    List<int[]> parseAllStream(List<String> lines);
}
