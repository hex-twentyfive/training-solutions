package iowritestring.school;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    Diary diary = new Diary();
    String testName = "John_Doe";

    @Test
    public void testNewMark() throws IOException {
        int testMark1 = 5;
        int testMark2 = 4;
        int testMark3 = 3;
        int testMark4 = 2;
        Path filePath = Path.of("src/main/resources/school/" + testName + ".txt");

        diary.newMark(testName, testMark1);
        diary.newMark(testName, testMark2);
        diary.newMark(testName, testMark3);
        diary.newMark(testName, testMark4);

        assertTrue(Files.exists(filePath));

        List<String> testFileContent = Files.readAllLines(filePath);

        assertEquals(testMark1, Integer.parseInt(testFileContent.get(0)));
    }

    @Test
    public void testYearEndAverage() throws IOException {

        Path filePath = Path.of("src/main/resources/school/" + testName + ".txt");
        String expectedString = "Average: 3.5";

        diary.yearEndAverage(testName);

        List<String> testFileContent = Files.readAllLines(filePath);

        System.out.println(testFileContent.get(4));
        assertEquals(expectedString, testFileContent.get(4));
    }

}