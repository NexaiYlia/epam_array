package com.nexai.array.validation;

import com.nexai.array.reader.impl.ArrayReaderImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayStringValidator {
    private static final Logger logger = LogManager.getLogger(ArrayStringValidator.class.getName());
    private static final String REGEX_STRING_LINE = "\\s*-?\\d+(\\s*-;\\s-?\\d+)*\\s";

    public static boolean validateArrayStringLine(String line) {
        boolean result = Pattern.matches(REGEX_STRING_LINE, line);
        return result;
    }
}
