package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCounterTest {

    @Test
    public void testCountTheWord() {
        LetterCounter access = new LetterCounter();
        String testWord = "25 aa bb 404 cc dd 88";
        int expectedResult = 4;

        assertEquals(expectedResult, access.countTheLetter(testWord) );
    }

    @Test
    public void testCountTheWordWithWrongParameters() {
        LetterCounter access = new LetterCounter();

        String testWordWithNull = null;
        String testWordWithEmptyString = "";

        assertThrows(IllegalArgumentException.class, ()->access.countTheLetter(testWordWithNull));
        assertThrows(IllegalArgumentException.class, ()->access.countTheLetter(testWordWithEmptyString));
    }

}