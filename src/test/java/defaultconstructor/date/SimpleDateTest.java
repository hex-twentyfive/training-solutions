package defaultconstructor.date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateTest {

    SimpleDate sD = new SimpleDate();

    @Test
    public void testSetDateWithValidDate() {

        int testYear = 1911;
        int testMonth = 11;
        int testDay = 11;

        sD.setDate(testYear, testMonth, testDay);

        assertEquals(1911, sD.getYear());
        assertEquals(11, sD.getMonth());
        assertEquals(11, sD.getDay());
    }

    @Test
    public void testSetDateWithInvalidDate() {

        int testYear = 1911;
        int testMonth = 19;         //Nem létező hónap próbája!
        int testDay = 11;

        assertThrows(IllegalArgumentException.class, ()->sD.setDate(testYear, testMonth, testDay));
    }

    @Test
    public void testSetDateWithLeapYear() {

        int testYear = 2000;
        int testMonth = 2;
        int testDay = 29;

        sD.setDate(testYear, testMonth, testDay);

        assertEquals(2000, sD.getYear());
        assertEquals(2, sD.getMonth());
        assertEquals(29, sD.getDay());
    }

}