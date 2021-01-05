package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    public void testGreatestCommonDivisor() {

        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        int testNumberOne = 75;
        int testNumberTwo = 60;

        int expectedResult = 15;

        assertEquals(expectedResult, mathAlgorithms.greatestCommonDivisor(testNumberOne, testNumberTwo));
    }

    @Test
    public void testGreatestCommonDivisorWithReversedNumbers() {

        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        int testNumberOne = 33;
        int testNumberTwo = 99;

        int expectedResult = 33;

        assertEquals(expectedResult, mathAlgorithms.greatestCommonDivisor(testNumberOne, testNumberTwo));
    }

}