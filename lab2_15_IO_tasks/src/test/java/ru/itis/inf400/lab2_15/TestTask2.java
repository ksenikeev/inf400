package ru.itis.inf400.lab2_15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString.toArray;

public class TestTask2 {
    @Test
    void toArraytest() {
        byte[] b = {4, 4, 40, -2, -2, -128, -128, -128};
        int[] array = new int[256];
        array[4] = 2;
        array[40] = 1;
        array[254] = 2;
        array[128] = 3;
        assertArrayEquals(Test2.toArray(b), array);
    }
}
