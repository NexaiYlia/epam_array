package com.nexai.array.exception;

public class ArrayReaderException extends Exception {
    private static final long serialVersionUiD = 1L;

    public ArrayReaderException() {
    }

    public ArrayReaderException(String message) {
        super(message);
    }

    public ArrayReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayReaderException(Throwable cause) {
        super(cause);
    }
}
