package ru.itis.inf400.lab2_15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

import static ru.itis.inf400.lab2_15.Task1.countingSort;

public class TestTask1 {
    @Test
    void testSort() {
        byte[] array = {-127, 38, 0, 19, 19, 0, 1, 13};
        byte[] sortedArray = {-127, 0, 0, 1, 13, 19, 19, 38};
        countingSort(array);
        Assertions.assertArrayEquals(array, sortedArray);
    }

}
