package iostringwriter.longwords;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongWordServiceTest {

    LongWordService longWordService = new LongWordService();

    @Test
    public void testStringWriterWriter() {
        List<String> testListWithLongWords = new ArrayList<>(
                List.of("verylongword", "evenmoreverylongerword","mostlongerword"));

        String stringToTestMethod = longWordService.stringWriterWrite(testListWithLongWords);

        String[] splitWords = stringToTestMethod.split("\n");

        int expectedSplitWordsLength = 3;

        assertEquals(expectedSplitWordsLength, splitWords.length );
        assertTrue(splitWords[0].contains("12"));

    }

}