package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testFindMinSum() {
        int[] testArray = {5, 3, 1, 9, 7};

        int expectedResult = 1 + 3 + 5 + 7;

        assertEquals(expectedResult, Calculator.findMinSum(testArray));
    }

    @Test
    public void testFindMinSumWithRepeatingNumbers() {
        int[] testArray = {5, 2, 3, 9, 7, 1, 2, 1};

        int expectedResult = 1 + 1 + 2 + 2;

        assertEquals(expectedResult, Calculator.findMinSum(testArray));
    }

    @Test
    public void testFindMinSumWithToSortArray() {
        int[] testArray = {5, 3, 1,};

        assertThrows(IllegalArgumentException.class, ()->Calculator.findMinSum(testArray));
    }

}