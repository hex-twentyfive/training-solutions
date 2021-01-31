package week04d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    public void testGetIndexOfChar() {
        String testWord = "almafa";
        char testCharacter = 'a';

        Search access = new Search();

        List<Integer> expectedResult = new ArrayList<>(List.of(0, 3, 5));

        assertEquals(expectedResult, access.getIndexOfChar(testWord, testCharacter));
    }

}