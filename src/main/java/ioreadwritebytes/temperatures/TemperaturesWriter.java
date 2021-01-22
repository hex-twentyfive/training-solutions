package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;

public class TemperaturesWriter {

    public void writeTemperatures(Temperatures temperatures, String Path) {
        try {
            Files.write(java.nio.file.Path.of(Path), temperatures.getData());
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write the file!", ioe);
        }
    }

}
