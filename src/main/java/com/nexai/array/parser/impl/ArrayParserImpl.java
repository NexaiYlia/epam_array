package com.nexai.array.parser.impl;

import com.nexai.array.exception.ArrayException;
import com.nexai.array.parser.ArrayParser;
import com.nexai.array.service.impl.ArrayCalculateServiceImpl;
import com.nexai.array.validation.ArrayStringValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;


public class ArrayParserImpl implements ArrayParser {
    private static final Logger logger = LogManager.getLogger(ArrayParserImpl.class.getName());
    public static final String REGEX_FOR_SPLIT = "[ \\s+,.!?]";

    @Override
    public int[] parseStringLineToArrayOfInt(String line) throws ArrayException {
        int[] arrayInt = new int[0];
        if (!line.isBlank() && ArrayStringValidator.validateArrayStringLine(line)) {
            logger.info("Parse string line to array of int");
            String[] arrayAfterSplit = line.split(REGEX_FOR_SPLIT);
            arrayInt = new int[arrayAfterSplit.length];
            for (int i = 0; i < arrayAfterSplit.length; i++) {
                try {
                    arrayInt[i] = Integer.parseInt(arrayAfterSplit[i]);
                } catch (NumberFormatException e) {
                    logger.error("Incorrect data format");
                    throw new ArrayException("Incorrect data format", e);
                }
            }
        }
        return arrayInt;
    }

}

