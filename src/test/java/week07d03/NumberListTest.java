package week07d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberListTest {

    @Test
    public void testIsIncreasing() {

        List<Integer> testWithIncreasingNumbers = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> testWithIncreasingAndRepeatingNumbers = new ArrayList<>(List.of(1,2,3,3,3,5));
        List<Integer> testWithNonIncreasingNumbers = new ArrayList<>(List.of(1,2,3,3,3,5,4));

        assertTrue(NumberList.isIncreasing(testWithIncreasingNumbers));
        assertTrue(NumberList.isIncreasing(testWithIncreasingAndRepeatingNumbers));
        assertFalse(NumberList.isIncreasing(testWithNonIncreasingNumbers));

    }

}