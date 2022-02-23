package com.nexai.array.reader;

import com.nexai.array.exception.ArrayReaderException;
import com.nexai.array.exception.FileNotExistException;

public interface ArrayReader {
    String readArrayFromFile(String PATHNAME) throws ArrayReaderException, FileNotExistException;
}
