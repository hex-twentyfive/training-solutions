package ioreaderclasspath.countries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryStatisticsTest {

    CountryStatistics access = new CountryStatistics();


    @Test
    public void testCountryFileReader() {

        assertEquals(0, access.getCountries().size());

        access.countryFileReader(access.getFileLocation());

        assertEquals(8, access.getCountries().size());

        assertEquals("Hungary", access.getCountries().get(0).getCountryName());
        assertEquals(7, access.getCountries().get(0).getNumberOfBorderCountries());
    }

    @Test
    public void testScannedCountryCounter() {
        assertEquals(0, access.scannedCountryCounter(access.getCountries()));

        access.countryFileReader(access.getFileLocation());

        assertEquals(8, access.scannedCountryCounter(access.getCountries()));
    }

    @Test
    public void testCountryWithMaximumBorder() {
        access.countryFileReader(access.getFileLocation());

        assertEquals("Germany", access.countryWithMaximumBorder());
    }

}