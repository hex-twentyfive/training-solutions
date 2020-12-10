package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {


    @Test
    public void tesztIsPrim2() {
        int testNumber = 2;

        assertTrue(MathAlgorithms.isPrime(testNumber));
    }

    @Test
    public void tesztIsPrim1() {
        int testNumber = 1;

        assertFalse(MathAlgorithms.isPrime(testNumber));
    }

    @Test
    public void tesztIsPrim100() {
        int testNumber = 100;

        assertFalse(MathAlgorithms.isPrime(testNumber));
    }

    @Test
    public void tesztIsPrim199() {
        int testNumber = 199;

        assertTrue(MathAlgorithms.isPrime(testNumber));
    }

    @Test
    public void tesztIsPrimNeg() {
        int testNumber = -1;

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new MathAlgorithms().isPrime(testNumber));
        assertEquals("The value of the number cannot be negative!", ex.getMessage());
    }

}