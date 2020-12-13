package constructoroverloading.bus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    SimpleTime sT;
    int testHoure = 19;
    int testMinutes = 11;

    @Test
    public void testSimpleTimeConstructorWithHoursAdnMinutes() {
        sT = new SimpleTime(testHoure, testMinutes);

        String expectedTime = "19 : 11";

        System.out.println(sT.toString());
        assertEquals(expectedTime, sT.toString());
    }

    @Test
    public void testSimpleTimeConstructorWithHours() {
        sT = new SimpleTime(testHoure);

        String expectedTime = "19 : 00";

        System.out.println(sT.toString());
        assertEquals(expectedTime, sT.toString());
    }

    @Test
    public void testSimpleTimeConstructorWithSimpleTime() {
        sT = new SimpleTime(new SimpleTime(testHoure, testMinutes));

        String expectedTime = "19 : 11";

        System.out.println(sT.toString());
        assertEquals(expectedTime, sT.toString());
    }

    @Test
    public void testTimeDiferenceCalculator() {
        sT = new SimpleTime(testHoure, testMinutes);

        int differentTimeToTestHours = 10;
        int differentTimeToTestMinutes = 00;
        SimpleTime differentTime = new SimpleTime(differentTimeToTestHours, differentTimeToTestMinutes);

        int expectedDiferentTime = 551;
        System.out.println(sT.difference(differentTime));

        assertEquals(expectedDiferentTime, sT.difference(differentTime));
    }

    @Test
    public void testdifferenceToStringForFun() {
        sT = new SimpleTime(testHoure, testMinutes);

        int differentTimeToTestHours = 10;
        int differentTimeToTestMinutes = 00;
        SimpleTime differentTime = new SimpleTime(differentTimeToTestHours, differentTimeToTestMinutes);

        String expectedDiferentTime = "9 : 11";

        // System.out.println(sT.differenceToStringForFun(sT.difference(differentTime)));

        assertEquals(expectedDiferentTime, sT.differenceToStringForFun(sT.difference(differentTime)));
    }

}