package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    public void changeVowels() {

        ChangeLetter changeLetter = new ChangeLetter();

        assertEquals("*****",changeLetter.changeVowels("aeiou"));

        assertEquals("*****",changeLetter.changeVowels("AEIOU"));

        assertEquals("",changeLetter.changeVowels(""));

    }

}
