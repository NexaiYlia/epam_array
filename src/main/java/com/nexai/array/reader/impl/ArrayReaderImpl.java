package com.nexai.array.reader.impl;

import com.nexai.array.exception.ArrayReaderException;
import com.nexai.array.exception.FileNotExistException;
import com.nexai.array.reader.ArrayReader;
import com.nexai.array.validation.TextFileValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class ArrayReaderImpl implements ArrayReader {
    private static final Logger logger = LogManager.getLogger(ArrayReaderImpl.class.getName());
    private static final String PATHNAME = "resources/data/array.txt";

    public String readArrayFromFile(String PATHNAME) throws ArrayReaderException, FileNotExistException {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(PATHNAME))) {
            line = reader.readLine();
            while (line != null) {
                logger.info("line " + line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            logger.error("Incorrect line");
            throw new FileNotExistException("This file " + PATHNAME + " not exist");

        } catch (IOException e) {

            logger.error("Incorrect line");
            throw new ArrayReaderException("The line could not be read");
        }
        return line;
    }
}


