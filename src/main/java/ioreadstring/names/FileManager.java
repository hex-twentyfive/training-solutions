package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path fileLocation;

    private List<Human> humans = new ArrayList<>();

    public FileManager(String fileLocation) {
        this.fileLocation = Path.of(fileLocation);
    }

    public void readFromFile() {
        try {
            List<String> fileRead = Files.readAllLines(this.fileLocation);
            for (String element: fileRead) {
                String[] name = element.split(" ");
                Human person = new Human(name[0], name[1]);
                humans.add(person);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

    public List<Human> getHumans() {
        return humans;
    }


}
