package ioreadstring.names;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    private FileManager access = new FileManager("src/main/resources/names.txt");

    @Test
    public void testReadFromFile() {
        access.readFromFile();
        int expectedSize = 3;
        String expectedFirstName = "John";

        assertEquals(expectedSize, access.getHumans().size());
        assertEquals(expectedFirstName, access.getHumans().get(0).getFirstName());

    }

}