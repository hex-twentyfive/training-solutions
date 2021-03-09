package week15d01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FunctionAnalysisTest {


    @Test
    public void testMaximumValue() {
        FunctionAnalysis access = new FunctionAnalysis();
        Map<Double, Double> testCoordinates = new HashMap<>(Map.of(-3.0, 3.0, -1.0, 4.0, 2.0, 6.0, 4.0, 5.0, 5.0, 1.0));
        double expectedX = 2.0;
        double expectedY = 6.0;

        assertEquals(expectedX, access.returnsTheMaximumValueOfTheFunctionWithEntryMap(testCoordinates).getKey());
        assertEquals(expectedY, access.returnsTheMaximumValueOfTheFunctionWithEntryMap(testCoordinates).getValue());
    }

    @Test
    public void testMaximumValueWithWrongParameter() {
        FunctionAnalysis access = new FunctionAnalysis();
        Map<Double, Double> testEmptyMap = new HashMap<>();

        assertThrows(IllegalArgumentException.class, ()-> access.returnsTheMaximumValueOfTheFunctionWithEntryMap(testEmptyMap));
    }

}