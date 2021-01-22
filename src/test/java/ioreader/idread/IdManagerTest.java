package ioreader.idread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdManagerTest {

    IdManager accesss = new IdManager();

    @Test
    public void testReadIdFromFile() {
        assertEquals(0, accesss.getIds().size());

        String fileLocation = "src/main/resources/ioreader/idnumbers.txt";
        accesss.readIdsFromFile(fileLocation);

        int expectedSize = 6;
        String expectedID = "111111GH";

        assertEquals(expectedSize, accesss.getIds().size());

        assertEquals(expectedID, accesss.getIds().get(5));
    }

}