package week10d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    public void testGetPlusElevation() {

        List<Double> testElevations = new ArrayList<>(List.of(10.0,20.0,15.0,18.0));

        double expectedElevation = 13;

        assertEquals(expectedElevation, Hiking.getPlusElevation(testElevations));
    }

}