package week14d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HachikoTest {

    @Test
    public void testCountWords() {
        Hachiko access = new Hachiko();
        Path fileLocation = Path.of("src/main/resources/hachiko.srt");

        assertEquals(16, access.countWords(fileLocation,"haza").get("haza"));
    }

}