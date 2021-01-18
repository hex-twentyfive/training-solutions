package ioreadbytes.byteacount;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int fileCharacterChecker(Path fileLocation, char character ) {
        int characterCounter = 0;
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(fileLocation))) {
            byte[] fileByteContent = inputStream.readAllBytes();
            for (byte bytes: fileByteContent) {
                if (character == (char)bytes) {
                    characterCounter++;
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not found the file!", ioe);
        }
        return characterCounter;
    }

}
