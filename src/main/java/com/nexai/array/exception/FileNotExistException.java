package com.nexai.array.exception;

public class FileNotExistException extends Exception {

    public FileNotExistException() {
    }

    public FileNotExistException(String message) {
        super(message);
    }

    public FileNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileNotExistException(Throwable cause) {
        super(cause);
    }
}
