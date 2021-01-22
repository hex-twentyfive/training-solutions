package ioprintwriter.salary;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWriterTest {

    @TempDir
    public Path temporaryFolder;

    @Test
    public void testWriteNameAndSalaries() throws IOException {
        List<String> testNames = new ArrayList<>(List.of("Dr John Doe", "Mr Jack Doe", "Mrs Jane Doe", "John Smith"));

        Path testFileLocation = Files.createFile(temporaryFolder.resolve("fileForTesting.txt"));

        System.out.println(testFileLocation);

        SalaryWriter salaryWriter = new SalaryWriter(testNames);

        salaryWriter.writeNamesAndSalaries(testFileLocation);

        List<String> actual = Files.readAllLines(testFileLocation);

        String expectedNameAndSalary1 = "Dr John Doe, 500000";
        String expectedNameAndSalary2 = "Mr Jack Doe, 200000";
        String expectedNameAndSalary3 = "Mrs Jane Doe, 200000";
        String expectedNameAndSalary4 = "John Smith, 100000";

        assertEquals(expectedNameAndSalary1, actual.get(0));
        assertEquals(expectedNameAndSalary2, actual.get(1));
        assertEquals(expectedNameAndSalary3, actual.get(2));
        assertEquals(expectedNameAndSalary4, actual.get(3));
    }

}