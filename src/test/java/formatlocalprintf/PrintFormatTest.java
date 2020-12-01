package formatlocalprintf;

import formatlocaleprintf.PrintFormat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrintFormatTest {


    @Test
    public void checkException() throws IllegalArgumentException {

        int i = 6;
        int j = 7;

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new PrintFormat().checkException("%d  %d  %d", i, j);
        });
        assertEquals("Parameter missing in String format!", ex.getMessage());
    }


    @Test
    public void printFormattedTextDouble() {
        // Given
        Double d = 561123.201;

        //Then
        assertEquals("Total is: 561 123,20 Ft", new PrintFormat().printFormattedTextDouble(d));
    }

    @Test
    public void printFormattedTextFruit() {
        // Given
        String fruit = "APPLES";
        int count = 6;

        //Then
        assertEquals("We counted 6 APPLES in the basket", new PrintFormat().printFormattedTextFruit(count, fruit));
    }

    @Test
    public void printFormattedTextNumber() {
        // Given
        int i = 6;
        int j = 66;
        int k = 666666;   //overflow to the right expected!

        //Then
        assertEquals("Right edge of numbers set at 4 spaces from text:   " + i, new PrintFormat().printFormattedTextNumber(i));
        assertEquals("Right edge of numbers set at 4 spaces from text:  " + j, new PrintFormat().printFormattedTextNumber(j));
        assertEquals("Right edge of numbers set at 4 spaces from text:" + k, new PrintFormat().printFormattedTextNumber(k));
    }

    @Test
    public void printFormattedTextInteger() {
        // Given
        int i = 6;
        int j = 7;
        int k = 8;

        //Then
        assertEquals("Multiple objects containing text:" + i + "\t" + j + "\t" + k, new PrintFormat().printFormattedTextInteger(i, j, k));
    }
}
