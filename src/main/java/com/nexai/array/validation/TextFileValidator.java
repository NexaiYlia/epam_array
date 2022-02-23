package com.nexai.array.validation;

import com.nexai.array.exception.FileNotExistException;

import java.io.File;

public class TextFileValidator {

    public boolean validateTextFile(String fileName) throws FileNotExistException {
        boolean result = false;
        if (!(new File(fileName).exists()) || fileName == null) {
            result = true;
        } else {
            throw new FileNotExistException("This fileName is null " + fileName);
        }
        return result;

    }
}
