package com.nexai.array.validation;

import com.nexai.array.exception.ArrayReaderException;
import com.nexai.array.exception.FileNotExistException;

import java.io.File;

public class TextFileValidator {

    public boolean validateTextFile(String fileName) throws ArrayReaderException {
        boolean result = false;
        if (!(new File(fileName).exists()) || fileName == null) {
            result = true;
        } else {
            throw new ArrayReaderException("This fileName is null " + fileName);
        }
        return result;

    }
}
