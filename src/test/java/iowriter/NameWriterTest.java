package iowriter;

import iowriter.names.NameWriter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameWriterTest {

    @TempDir
    public Path temporaryFolder;

    @Test
    public void testWrite() throws IOException {
        Path file = Files.createFile(temporaryFolder.resolve("test.txt"));
        System.out.println(file);
        NameWriter nameWriter = new NameWriter(file);
        nameWriter.addAndWrite("John Smith");

        List<String> actual = Files.readAllLines(file);

        assertEquals(List.of("John Smith"), actual);
    }

    @Test
    public void testAppend() throws IOException {
        Path file = Files.createFile(temporaryFolder.resolve("test.txt"));

        NameWriter nameWriter = new NameWriter(file);
        nameWriter.addAndWrite("John Smith");
        nameWriter.addAndWrite("John Doe");

        List<String> actual = Files.readAllLines(file);

        assertEquals(List.of("John Smith", "John Doe"), actual);
    }

}
