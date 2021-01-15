package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    public void testWordsWithChar() {
        List<String> testWords = new ArrayList<>(List.of("alma", "körte", "banán", "ananász","elefánt"));
        char testCharacterToScan = 'a';
        List<String> expectedResult = new ArrayList<>(List.of("alma", "banán", "ananász"));

        assertEquals(expectedResult, WordFilter.wordsWithChar(testWords, testCharacterToScan));
    }

    @Test
    public void testWordWithCharWithEmptyList() {
        List<String> testWords = new ArrayList<>();
        char testCharacterToScan = 'a';
        List<String> expectedResult = new ArrayList<>();

        assertEquals(expectedResult, WordFilter.wordsWithChar(testWords, testCharacterToScan));
    }

}