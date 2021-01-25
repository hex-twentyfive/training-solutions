package week12d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {

    @Test
    public void testRoundGrades() {
        int[] testGrades = {34, 81, 84};
        int[] expectedArray ={34, 81, 85};

        int[] roundedNumbersArray = GradeRounder.roundGrades(testGrades);

        assertEquals(expectedArray[0], roundedNumbersArray[0]);
        assertEquals(expectedArray[1], roundedNumbersArray[1]);
        assertEquals(expectedArray[2], roundedNumbersArray[2]);
    }

    @Test
    public void testRoundGradesByAdam() {
        int[] testGrades = {34, 81, 84};
        int[] expectedArray ={34, 81, 85};

        int[] roundedNumbersArray = GradeRounder.roundGradesByAdam(testGrades);

        assertEquals(expectedArray[0], roundedNumbersArray[0]);
        assertEquals(expectedArray[1], roundedNumbersArray[1]);
        assertEquals(expectedArray[2], roundedNumbersArray[2]);
    }

}