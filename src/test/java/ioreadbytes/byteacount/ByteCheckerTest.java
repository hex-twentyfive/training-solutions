package ioreadbytes.byteacount;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class ByteCheckerTest {

    @Test
    public void testFileCharacterChecker() {
        ByteChecker byteChecker = new ByteChecker();

        Path testFile = Path.of("C:\\training\\training-solutions\\src\\main\\java\\ioreadbytes\\byteacount\\ByteChecker.java");
        char testCharacter = 'a';

        int expectedResult = 45;

        assertEquals(expectedResult, byteChecker.fileCharacterChecker(testFile, testCharacter));
    }

}