package ioreadbytes.bytematrix;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class MatrixReaderTest {

    MatrixReader matrixReader = new MatrixReader();
    private Path fileLocation = Path.of("src/main/resources/GeneratedFileForTestMatrixReader.dat");

    @Test
    public void testFileByteReader() {
        assertEquals(0, matrixReader.getMatrixDataContent().size());

        matrixReader.fileByteReader(fileLocation);

        int expectedListSize = 6;

        assertEquals(expectedListSize, matrixReader.getMatrixDataContent().size());
        assertEquals(1000, matrixReader.getMatrixDataContent().get(5).length);
    }

    @Test
    public void testMatrixContentScanner() {
        matrixReader.fileByteReader(fileLocation);

        assertEquals(0, matrixReader.matrixContentScanner(matrixReader.getMatrixDataContent()));
    }

}