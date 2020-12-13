package defaultconstructor.date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {

    private SimpleDate sD;

    @BeforeEach
    public void setUp() {
        sD = new SimpleDate();
        sD.setDate(1911, 11,19);
    }

    @AfterEach
    public void terDown() {
        sD = null;
    }

    @Test
    public void testFormatDateStringByCountryCodeHU() {
        String expectedDateFormat = "1911-11-19";

        System.out.println(new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.HU, sD));
        assertEquals(expectedDateFormat, new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.HU, sD));
    }

    @Test
    public void testFormatDateStringByCountryCodeEN() {
        String expectedDateFormat = "19-11-1911";

        System.out.println(new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.EN, sD));
        assertEquals(expectedDateFormat, new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.EN, sD));
    }

    @Test
    public void testFormatDateStringByCountryCodeUS() {
        String expectedDateFormat = "11-19-1911";

        System.out.println(new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.US, sD));
        assertEquals(expectedDateFormat, new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.US, sD));
    }

    @Test
    public void testFormatDateStringDefaultFormat() {
        String expectedDateFormat = "1911-11-19";

        assertEquals(expectedDateFormat, new SimpleDateFormatter().formatDateString(sD));
    }
}