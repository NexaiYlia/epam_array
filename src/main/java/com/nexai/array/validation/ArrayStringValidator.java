package com.nexai.array.validation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class ArrayStringValidator {
    private static final Logger logger = LogManager.getLogger(ArrayStringValidator.class.getName());
    private static final String REGEX_STRING_LINE = "[-?\\d+\\s+]";

    public static boolean validateArrayStringLine(String line) {
        boolean result = (line != null) && (line.isBlank() && Pattern.matches(REGEX_STRING_LINE, line));
        logger.info("line is correct:" + result);
        return result;
    }
}
