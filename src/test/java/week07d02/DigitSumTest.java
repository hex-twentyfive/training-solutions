package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumTest {

    @Test
    public void testSumOfDigits() {
        int testNumber = 5555;
        int expectedNumber = 20;

        assertEquals(expectedNumber, DigitSum.sumOfDigits(testNumber));
    }

}