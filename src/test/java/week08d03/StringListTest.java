package week08d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListTest {

    @Test
    public void testStringListUnion() {

        List<String> fistTestList = new ArrayList<>(List.of("a","b","c"));
        List<String> secondTestList = new ArrayList<>(List.of("a","d"));

        List<String> expectedResult = new ArrayList<>(List.of("a","b","c","d"));

        assertEquals(expectedResult, StringList.stringListUnion(fistTestList,secondTestList));
    }

}