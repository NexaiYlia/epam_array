package com.nexai.array.parser;

import com.nexai.array.exception.ArrayException;

public interface ArrayParser {
    int[] parseStringLineToArrayOfInt(String line) throws ArrayException;
}
