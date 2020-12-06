package methodvarargs;

import methodvarargs.examstats.ExamStats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExamStatsTest {

    @Test
    public void testGetNumberOfTopGradesWithEmptyResults() {
        ExamStats eS = new ExamStats(100);

        Exception exceptionWithEmptyResults = assertThrows(IllegalArgumentException.class, () -> eS.getNumberOfTopGrades(66));
        assertEquals("Empty results is not allowed!", exceptionWithEmptyResults.getMessage());
    }

    @Test
    public void testGetNumberOfTopGradesWithNullValue() {
        ExamStats eS = new ExamStats(100);

        Exception exceptionWithEmptyResults = assertThrows(IllegalArgumentException.class, () -> eS.getNumberOfTopGrades(66, null));
        assertEquals("Empty results is not allowed!", exceptionWithEmptyResults.getMessage());
    }

    @Test
    public void testGetNumberOfTopGrades() {
        ExamStats eS = new ExamStats(100);

        assertEquals(3, eS.getNumberOfTopGrades(66, 55,65,75,85,95));
        assertEquals(1, eS.getNumberOfTopGrades(90, 55,65,75,85,95));
    }

    @Test
    public void testHasAnyFailedWithEmptyResults() {
        ExamStats eS = new ExamStats(100);

        Exception exceptionWithEmptyResults = assertThrows(IllegalArgumentException.class, () -> eS.hasAnyFailed(66));
        assertEquals("Empty results is not allowed!", exceptionWithEmptyResults.getMessage());
    }

    @Test
    public void testHasAnyFailed() {
        ExamStats eS = new ExamStats(100);

        assertTrue(eS.hasAnyFailed(66, 55, 65, 75, 85, 95));
        assertFalse(eS.hasAnyFailed(50, 55, 65, 75, 85, 95));
    }

}
