package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

/*    Adott az aktuális könyvtárban több, fájl, melynek a nevei: number00.txt, number03.txt, number20.txt, egészen 99-ig.
    Nem minden fájl létezik, lehet, hogy bizonyos számhoz tartozó fájl kimaradt. Olvasd be az állományból a benne lévő számot,
    és ezt összegezd! Használd a Files.isRegularFile() metódust arra, hogy megnézd, létezik-e a fájl! Használd a Files.readString()
    metódust a fájl beolvasására! A FilesSum osztály int sumNumbers() metódusába dolgozz!
*/

    public static int  sumNumbers() {
        String fileDirectory ="src/main/resources/week/week11d04/";
        int fileContentSum = 0;

        for (int i=0; i<100; i++) {
            String fileName = null;
            if (i<10) {
                fileName = "number0" + i + ".txt";
            } else {
                fileName = "number" + i + ".txt";
            }
            Path fileLocation = Path.of(fileDirectory + fileName );
            if (Files.isRegularFile(fileLocation)) {
                try {
                    String fileContent = Files.readString(fileLocation);
                    fileContentSum += Integer.parseInt(fileContent);
                }
                catch (IOException ioe) {
                    throw new IllegalStateException("Can not read the file!", ioe);
                }
            }
        }
    return fileContentSum;
    }

}
