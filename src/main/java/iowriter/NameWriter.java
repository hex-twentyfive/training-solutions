package iowriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NameWriter {

    private Path fileLocation;

    public NameWriter(Path fileLocation) {
        this.fileLocation = fileLocation;
    }

    public void addAndWrite(String name) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(fileLocation, StandardOpenOption.APPEND)) {
            bufferedWriter.write(name + "\n");

        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write the file!", ioe);
        }
    }


}
