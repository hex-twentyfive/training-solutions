package week13d03;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class TeacherWorkingHoursTest {

    TeacherWorkingHours access = new TeacherWorkingHours();

    @Test
    public void testFileReadingAndCounting() {
        String fileLocation = "/beosztas.txt";
        String testTeacherName = "Csincsilla Csilla";
        int expectedNumberOfWorkingHours = 22;

        System.out.println(access.returnTheWorkingHoursFromFile(fileLocation, testTeacherName));
        assertEquals(expectedNumberOfWorkingHours, access.returnTheWorkingHoursFromFile(fileLocation, testTeacherName));
    }

}