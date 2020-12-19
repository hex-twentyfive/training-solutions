package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LabTest {

    @Test
    public void testCteateLabWithOneParameter() {
        Lab testLab = new Lab("week07d04.Lab");

        assertEquals("week07d04.Lab", testLab.getTitle());
        assertFalse(testLab.isCompleted());
    }

    @Test
    public void testCteateLabWithTwoParameters() {
        LocalDate testDate = LocalDate.of(2020,12, 15);
        Lab testLab = new Lab("week07d04.Lab", testDate);

        assertEquals("week07d04.Lab", testLab.getTitle());
        assertEquals(testDate, testLab.getCompletedAt());
        assertTrue(testLab.isCompleted());
    }

    @Test
    public void testCompleteWithOneParameter() {
        Lab testLab = new Lab("week07d04.Lab");
        LocalDate testDate = LocalDate.of(2020,12, 15);

        testLab.complete(testDate);

        assertEquals("week07d04.Lab", testLab.getTitle());
        assertEquals(testDate, testLab.getCompletedAt());
        assertTrue(testLab.isCompleted());
    }

    @Test
    public void testCompleteWithNoParameter() {
        Lab testLab = new Lab("week07d04.Lab");
        LocalDate testDateNow = LocalDate.now();

        testLab.complete();

        assertEquals("week07d04.Lab", testLab.getTitle());
        assertEquals(testDateNow, testLab.getCompletedAt());
        assertTrue(testLab.isCompleted());
    }

}