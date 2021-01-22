package ioreader.idread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {

    private List<String> ids = new ArrayList<>();

    public void readIdsFromFile(String fileLocation) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(fileLocation))) {
            String line ;
            while((line = reader.readLine()) != null) {
                ids.add(line);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

    public List<String> getIds() {
        return ids;
    }


}
