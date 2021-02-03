package week12d05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoronaCounterTest {


    CoronaCounter access = new CoronaCounter();

    @Test
    public void testFileReader() {
        assertEquals(0, access.getReadFileRows().size());

        access.fileReader(access.getFileLocation());

        assertEquals(7990, access.getReadFileRows().size());
    }

    @Test
    public void testCoronaCounter() {
        String testWordToSearch = "koronavírus";
        access.fileReader(access.getFileLocation());

        assertEquals(9, access.coronaCounter(access.getReadFileRows(), testWordToSearch));
    }

}