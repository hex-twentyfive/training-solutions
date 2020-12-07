package week06d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordEraserTest {

    @Test
    public void test() {

        WordEraser wE = new WordEraser();

        String inputString = "alma körte barack alma szilva körte birsalma";
        String expectedString = "körte barack szilva körte birsalma";
        String wordToDelete = "alma";

        Assertions.assertEquals(expectedString, wE.eraseWord(inputString,wordToDelete));

    }

}
