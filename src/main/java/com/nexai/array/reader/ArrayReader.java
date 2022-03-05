package com.nexai.array.reader;

import com.nexai.array.exception.ArrayReaderException;
import com.nexai.array.exception.FileNotExistException;

import java.util.List;

public interface ArrayReader {
    String readLineFromFile(String PATHNAME) throws ArrayReaderException, FileNotExistException;

    List<String> readAllLineFromFileStream(String PATHNAME) throws ArrayReaderException;
}
