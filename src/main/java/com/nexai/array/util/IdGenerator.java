package com.nexai.array.util;

import java.util.UUID;

public class IdGenerator {
    private static long counter;

    private IdGenerator() {
    }

    public static long generateId() {
        return ++counter;
    }
}
