package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {


    @Test
    public void tesztIsPrimNegativeNumber() {
        int testNumber = -1;
        String expectedExeption = "The value of the number cannot be negative!";

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new MathAlgorithms().isPrime(testNumber));
        assertEquals(expectedExeption, ex.getMessage());
    }

    @Test
    public void tesztIsPrimeZeroNumber() {
        int testNumber = 0;
        String expectedExeption = "Wrong parameter!";

        Exception exception = assertThrows(IllegalArgumentException.class, () -> new MathAlgorithms().isPrime(testNumber));
        assertEquals(expectedExeption, exception.getMessage() );
    }

    @Test
    public void tesztIsPrimWithNumberOne() {
        int testNumber = 1;

        assertFalse(MathAlgorithms.isPrime(testNumber));
    }

    @Test
    public void tesztIsPrimWithNumberTwo() {
        int testNumber = 2;

        assertTrue(MathAlgorithms.isPrime(testNumber));
    }

    @Test
    public void tesztIsPrimWithOneHundred() {
        int testNumber = 100;

        assertFalse(MathAlgorithms.isPrime(testNumber));
    }

    @Test
    public void tesztIsPrimOneHundredAndOne() {
        int testNumber = 101;

        assertTrue(MathAlgorithms.isPrime(testNumber));
    }



}