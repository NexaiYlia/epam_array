package com.nexai.array.exception;

public class ArrayException extends Exception {
    private static final long serialVersionUiD = 1L;

    public ArrayException() {
    }

    public ArrayException(String message) {
        super(message);
    }

    public ArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayException(Throwable cause) {
        super(cause);
    }
}
