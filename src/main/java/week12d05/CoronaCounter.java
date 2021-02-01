package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CoronaCounter {

/*  Töltsd le az index.hu nyitólapját böngészőből, ez egy html állomány! Másold be a projektedbe (index.html) néven!
    Ez egy szöveges állomány. Olvasd be, és számold meg, hány sorban szerepel a koronavírus szó!
*/

    private List<String> readFileRows = new ArrayList<>();

    private Path fileLocation = Path.of("src/main/resources/week/week12d05/index.htm");


    public int coronaCounter(List<String> rows, String searchedWord) {
        int koronavirusCounter = 0;
        for (String row: rows) {
            if (row.contains(searchedWord)) {
                koronavirusCounter ++;
            }
        }
        return koronavirusCounter;
    }

    public void fileReader(Path fileLocation) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(fileLocation)) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                readFileRows.add(line);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

    public List<String> getReadFileRows() {
        return readFileRows;
    }

    public Path getFileLocation() {
        return fileLocation;
    }

}