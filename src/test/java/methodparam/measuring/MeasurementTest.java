package methodparam.measuring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

       private double[] testMeasurements = {5.5, 10.5, 20.5, 15.5, 25.5, 30.5, 45.5, 50.5};

       private int lowerLimit = 10;
       private int highestLimit = 40;

       Measurement mm = new Measurement(testMeasurements);


    @Test
    public void testFindFirstIndexInLimit() {

        assertEquals(1, mm.findFirstIndexInLimit(lowerLimit, highestLimit));
    }

    @Test
    public void testMinimumValueSearch() {

        assertEquals(5.5, mm.minimum());
    }

    @Test
    public void testMaximumValueSearch() {

        assertEquals(50.5, mm.maximum());
    }

    @Test
    public void testMinMax() {

        assertEquals(5.5, mm.minmax().getMinValue());
        assertEquals(50.5, mm.minmax().getMaxValue());
    }

}