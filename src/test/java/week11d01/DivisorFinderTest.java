package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    @Test
    public void testFindDivisors() {
        int testNumber = 425;
        int expectedResult = 1;

        assertEquals(expectedResult,DivisorFinder.findDivisors(testNumber));
    }

    @Test
    public void testFindDivisorsWithGreaterNumber() {
        int testNumber = 505057890;
        int expectedResult = 3;

        assertEquals(expectedResult,DivisorFinder.findDivisors(testNumber));
    }

}