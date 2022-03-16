package com.nexai.array.parser.impl;

import com.nexai.array.exception.ArrayException;
import com.nexai.array.parser.ArrayParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayParserImpl implements ArrayParser {
    private static final Logger logger = LogManager.getLogger(ArrayParserImpl.class.getName());
    public static final String REGEX_FOR_SPLIT = ";";

    @Override
    public int[] parseStringLineToArrayOfInt(String line) throws ArrayException {
        line = line.replaceAll("\\s+", " ");
        int[] arrayInt = new int[0];
        if (!line.isBlank()) {
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

    @Override
    public List<int[]> parseAllLineToString(List<String> lines) throws ArrayException {
        List<int[]> arrays = new ArrayList<>();
        int[] arrayEntity;
        for (String line : lines) {
            arrayEntity = parseStringLineToArrayOfInt(line);
            arrays.add(arrayEntity);
        }
        logger.info("Arrays list parsed." + arrays);
        return arrays;
    }

    @Override
    public int[] parseStringLineToArrayOfIntStream(String line) {
        line = line.replaceAll("\\s+", " ");
        if (line.isBlank()) {
            return new int[0];
        }
        line = line.replaceAll("\\s", "");
        String[] lineParts = line.split(REGEX_FOR_SPLIT);
        int[] array = Arrays.stream(lineParts).mapToInt(Integer::parseInt).toArray();
        logger.info("Array from line='" + line + "' parsed. " + Arrays.toString(array));
        return array;
    }

    @Override
    public List<int[]> parseAllStream(List<String> lines) {
        List<int[]> arrays = lines.stream()
                .map(this::parseStringLineToArrayOfIntStream)
                .collect(Collectors.toList());
        logger.info("All line is parsed with stream" + arrays);
        return arrays;
    }
}

