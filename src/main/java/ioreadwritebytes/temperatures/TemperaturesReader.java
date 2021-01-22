package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {

    public Temperatures readTemperatures(String pathString) {
        try {
            byte[] fileByteContent = Files.readAllBytes(Path.of(pathString));
            return new Temperatures(fileByteContent);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

}
