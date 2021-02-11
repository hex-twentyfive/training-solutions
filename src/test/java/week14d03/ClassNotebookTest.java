package week14d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassNotebookTest {

    @Test
    public void testSortNotebook() {
        List<Student> testStudents = new ArrayList<>(List.of(
                new Student("John Doe"),
                new Student("Albert Doe"),
                new Student("Omaha Doe"),
                new Student("Jack Doe")
        ));
        ClassNotebook access = new ClassNotebook(testStudents);

        assertEquals("John Doe", access.getStudents().get(0).getName());

        assertEquals("Albert Doe", access.sortNotebook().get(0).getName());
        assertEquals("Omaha Doe", access.sortNotebook().get(3).getName());
    }

    @Test
    public void testSortNotebookByComparator() {
        List<Student> testStudents = new ArrayList<>(List.of(
                new Student("John Doe"),
                new Student("Albert Doe"),
                new Student("Omaha Doe"),
                new Student("Jack Doe")
        ));
        ClassNotebook access = new ClassNotebook(testStudents);

        assertEquals("John Doe", access.getStudents().get(0).getName());

        assertEquals("Albert Doe", access.sortNotebookByComparator().get(0).getName());
        assertEquals("Omaha Doe", access.sortNotebookByComparator().get(3).getName());
    }

}