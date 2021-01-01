package week08d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    public void testGetNumber() {
        int volumeOfNeededNumbers = 5;
        int intervalOfNumbers = 90;

        int expectedSize = 5;

        assertEquals(expectedSize, Lottery.getNumbers(intervalOfNumbers, volumeOfNeededNumbers).size());
    }

}