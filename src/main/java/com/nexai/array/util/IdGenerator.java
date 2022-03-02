package com.nexai.array.util;


public class IdGenerator {
    private static long counter;

    private IdGenerator() {
    }

    public static long generateId() {
        return ++counter;
    }
}
