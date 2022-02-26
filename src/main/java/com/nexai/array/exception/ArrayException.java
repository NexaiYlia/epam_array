package com.nexai.array.exception;

public class ArrayException extends Exception {
    private static final long serialVersionUiD = 1L;

    public ArrayException() {
    }

    public ArrayException(String message) {
        super(message);
    }

    public ArrayException(String message, Exception e) {
        super(message, e);
    }

    public ArrayException(Throwable cause) {
        super(cause);
    }
}
