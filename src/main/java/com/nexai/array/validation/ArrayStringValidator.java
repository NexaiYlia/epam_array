package com.nexai.array.validation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ArrayStringValidator {
    private static final Logger logger = LogManager.getLogger(ArrayStringValidator.class.getName());
    private static final String REGEX_STRING_LINE = "\\s*(-\\s*)?\\d+(\\s*;\\s*(-\\s*)?\\d+)*\\s*";

    public static boolean validateArrayStringLine(String line) {
        boolean result = line != null && (line.isBlank() || line.matches(REGEX_STRING_LINE));
        logger.info("line is correct:" + result);
        return result;
    }
}


