package ru.itis.inf400.lab2_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class TestMathUnit {

    @Test
    @DisplayName("sum a + b")
    void testSum() {
        // "Эталон"
        int expected = 5;


        //  Вычисленное значение
        int actual = MathUnit.sum(2,3);
        assertEquals(expected, actual);

        assertEquals(0, MathUnit.sum(2,-2));

        assertEquals(-4, MathUnit.sum(-2,-2));

        assertEquals(-1, MathUnit.sum(Integer.MIN_VALUE,Integer.MAX_VALUE));
    }


    @Test
    @DisplayName("compare test")
    void testCompare() {
         //  Вычисленное значение
        int actual = MathUnit.compare(8,3);
        assertTrue(actual > 0);
    }

    @Test
    void testDivide() {

        try {
            assertEquals(3, MathUnit.divide(7, 2));
        } catch (DivideByNull e) {
            fail("Неверный аргумент 0");
        }

        assertThrows(DivideByNull.class,
                () -> {MathUnit.divide(5, 0);}
        );
    }

    @Test
    void testSort() {

        MathUnit mathUnit = new MathUnit();

        // массив из одинаковых элементов
        // массив из повторяющихся элементов
        // массив из элементов в обратном порядке

        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8},
                mathUnit.sort(new int[] {1,2,3,4,5,6,7,8}));
    }
}
