package week10d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {


    @Test
    public void testGetMaxIndex() {
        List<Integer> testBusStationList = new ArrayList<>(List.of(12,12,0,3,4,4,4));

        String expectedResult = "The most frequently used station -> Station 4 \nwhere the number of passengers -> 3";

        assertEquals(expectedResult, MaxTravel.getMaxIndex(testBusStationList));
    }

    @Test
    public void testGetMaxIndexWithOverSizedList() {
        List<Integer> testBusStationList = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            testBusStationList.add(i);
        }

        assertThrows(IllegalArgumentException.class, ()->MaxTravel.getMaxIndex((testBusStationList)));
    }

    @Test
    public void testGetMaxIndexWithNullElementList() {
        List<Integer> testBusStationList = new ArrayList<>();

        assertThrows(IllegalArgumentException.class, ()->MaxTravel.getMaxIndex((testBusStationList)));
    }

}

