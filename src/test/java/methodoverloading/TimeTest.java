package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    public void testCreatingTimeWithThreeParameters() {

        Time time = new Time(19,11,0);

        assertEquals(19, time.getHours());
        assertEquals(11, time.getMinutes());
        assertEquals(0, time.getSeconds());
    }

    @Test
    public void testCreatingTimeWithTwoParameters() {

        Time time = new Time(19,11);

        assertEquals(19, time.getHours());
        assertEquals(11, time.getMinutes());
    }

    @Test
    public void testCreatingTimeWithOneParameter() {

        Time time = new Time(19);

        assertEquals(19, time.getHours());
    }

    @Test
    public void testCreatingTimeWithTimeParameter() {

        Time initialTime = new Time(19,11,00);
        Time forwardedTime = new Time(initialTime);

        assertEquals(19, forwardedTime.getHours());
        assertEquals(11, forwardedTime.getMinutes());
        assertEquals(0, forwardedTime.getSeconds());
    }

    @Test
    public void testIsEqualWithTimeParameter() {

        Time time = new Time(19,11,0);
        Time equalTime = new Time(19,11,0);
        Time nonEqualTime = new Time(10,25,0);

        assertTrue(time.isEqual(equalTime));
        assertFalse(time.isEqual(nonEqualTime));
    }

    @Test
    public void testIsEqualWithThreeParameters() {

        Time time = new Time(19,11,0);
        int comparisonHour = 19;
        int comparisonMin = 11;
        int comparisonSecond = 0;

        assertTrue(time.isEqual(comparisonHour,comparisonMin,comparisonSecond));
        assertFalse(time.isEqual(19, 11, 1));
    }

    @Test
    public void testIsEarlierWithTimeParameter() {

        Time time = new Time(19,11,0);
        Time earlierTime = new Time(18, 0,0);
        Time laterTime = new Time(20,0,0);

        assertTrue(time.isEarlier(laterTime));
        assertFalse(time.isEarlier(earlierTime));
    }

    @Test
    public void testIsEarlierWithThreeParameters() {

        Time time = new Time(19, 11, 0);
        int laterHour = 20;
        int laterMin = 0;
        int laterSecond = 0;

        assertTrue(time.isEarlier(laterHour, laterMin, laterSecond));
        assertFalse(time.isEarlier(18,0,0));
    }
}