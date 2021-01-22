package ioreadwritebytes.temperatures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturesTest {

    private byte[] temps = new byte[365];

    @BeforeEach
    public void generateRandomTempContent() {
        Random random = new Random(20);
        random.nextBytes(temps);
    }

    @Test
    public void testGetYearAverage() {
        Temperatures access = new Temperatures(temps);

        double expectedAverage = -5.47945205479452;

        assertEquals(expectedAverage, access.getYearAverage(), 0.01);
    }

    @Test
    public void testGetMonthAverage() {
        Temperatures access = new Temperatures(temps);

        double expectedAverage = -21.666666666666668;

        assertEquals(expectedAverage, access.getMonthAverage(), 0.01);
    }

}