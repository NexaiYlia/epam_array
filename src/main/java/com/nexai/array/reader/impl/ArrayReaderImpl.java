package com.nexai.array.reader.impl;

import com.nexai.array.exception.ArrayException;
import com.nexai.array.exception.ArrayReaderException;
import com.nexai.array.reader.ArrayReader;
import com.nexai.array.validation.ArrayStringValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayReaderImpl implements ArrayReader {
    private static final Logger logger = LogManager.getLogger(ArrayReaderImpl.class.getName());
    private static final String PATHNAME = "resources/data/array.txt";

    public String readLineFromFile(String PATHNAME) throws ArrayReaderException {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(PATHNAME))) {
            line = reader.readLine();
            while (line != null) {
                logger.info("line " + line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            logger.error("Incorrect line");
            throw new ArrayReaderException("This file " + PATHNAME + " not exist");

        } catch (IOException e) {

            logger.error("Incorrect line");
            throw new ArrayReaderException("The line could not be read");
        }
        return line;
    }

    @Override
    public List<String> readAllLineFromFile(String PATHNAME) throws ArrayException {
        List<String> lines = new ArrayList<>();
        String currentLine;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATHNAME))) {
            while (bufferedReader.ready()) {
                currentLine = bufferedReader.readLine();
                ArrayStringValidator validator = new ArrayStringValidator();
                if (validator.validateArrayStringLine(currentLine)) {
                    logger.debug("Next array line='" + currentLine + "'");
                }
                if (currentLine != null) {
                    lines.add(currentLine);
                }
            }
        } catch (IOException ioException) {
            logger.error("Exception when use BufferedReader object", ioException);
            throw new ArrayException(ioException);
        }
        logger.info("All array strings read." + lines);
        return lines;
    }

    public List<String> readAllLineFromFileStream(String PATHNAME) throws ArrayReaderException {
        List<String> lines;
        Path path = Paths.get(PATHNAME);
        try {
            Stream<String> lineStream = Files.lines(path);
            lines = lineStream.filter(ArrayStringValidator::validateArrayStringLine).toList();
        } catch (IOException e) {
            logger.error("Incorrect line" + e.getMessage());
            throw new ArrayReaderException("The line could not be read", e);
        }
        return lines;
    }
}


