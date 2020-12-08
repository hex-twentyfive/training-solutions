package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiscuitTest {

    @Test
    public void testToString() {

        String expectedString = "PILÓTA: 100 g";
        String testValue = Biscuit.of(BiscuitType.PILÓTA, 100).toString();

        assertEquals(expectedString,testValue);
    }

}