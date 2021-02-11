package week14d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    public void createStudent() {
        Student access = new Student("John Doe");

        assertEquals("John Doe", access.getName());
        assertEquals(0, access.getSubjectsAndGrades().size());
    }

    @Test
    public void testEnterTheGrade() {
        Student access = new Student("John Doe");

        access.enterTheGrade("Matematika", 4);
        access.enterTheGrade("Matematika", 5);

        Map<String, List<Integer>> expectedMap = new HashMap<>();
        expectedMap.put("Matematika", new ArrayList<>(List.of(4,5)));

        assertEquals(expectedMap, access.getSubjectsAndGrades());

        access.enterTheGrade("Fizika", 5);

        assertEquals(2, access.getSubjectsAndGrades().size());
    }

}