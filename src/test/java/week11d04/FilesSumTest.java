package week11d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilesSumTest {

    @Test
    public void testSumNumbers() {

        int expectedFileContentSum = 1 + 3 + 5 + 20 + 55;

        assertEquals(expectedFileContentSum, FilesSum.sumNumbers());
    }

}