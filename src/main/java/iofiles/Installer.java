package iofiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Installer {

/*  Készíts egy Installer osztályt, egyetlen install() metódussal, mely paraméterként a telepítési mappát kapja meg String-ként.
    A megadott mappán belülre másold át a classpathról az install mappában lévő fájlokat és mappákat az install mappából!
    Az install.txt fájlban a / jelre végződő sorok mappákat jelölnek, ezeket létre kell hoznod, mielőtt fájlokat másolnál bele.
    Az esetleges sikertelen telepítésből visszamaradt fájlokat mindig írd felül!
    Ha a paraméterül kapott mappa nem létezik vagy nem is mappa, dobj IllegalArgumentException kivételt!
    bin/
    bin/binfile.txt
    data/
    data/data1.dat
    data/data2.dat
*/

    private static final String INSTALL_SOURCE = "src/main/resources/install/";


    public void install(String installDirectory) {
        if (Files.notExists(Path.of(installDirectory)) || !Files.isDirectory(Path.of(installDirectory))) {
            throw new IllegalArgumentException("The target directory is not exist! Please try another time!");
        }
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/install/install.txt")))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.endsWith("/")) {
                    Files.createDirectory(Path.of(installDirectory + line));
                } else {
                    Files.copy(Path.of(INSTALL_SOURCE + line), Path.of(installDirectory + line), StandardCopyOption.REPLACE_EXISTING);
                }
            }
            System.out.println("The installation process completed successfully!");
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not finish the install process!", ioe);
        }
    }

}