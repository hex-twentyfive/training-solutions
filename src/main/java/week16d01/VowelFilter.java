package week16d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


/*  Írj egy VowelFilter.filterVowels(BufferedReader reader) metódust, mely beolvas egy fájlt soronként,
    kiszűri belőle a magánhangzókat, és visszaadja egy String-ként.
      bemeneti: Aprócska      kimeneti: prcsk
                Kalapocska              Klpcsk
                Benne                   Bnn
                Csacska                 Cscsk
                Macska                  Mcsk
                Mocska                  Mcsk
*/

public class VowelFilter {

    public String filterVowels(BufferedReader reader) {
        StringBuilder sb = new StringBuilder();
        try {
            String line;
            while((line = reader.readLine()) != null) {
                String filteredLine = filtersOutVowels(line);
                sb.append(filteredLine + "\n");
            } }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
        return sb.toString();
    }

    private String filtersOutVowels(String line) {
        String vowels = "[aáeéiíoóöőuúüűAÁEÉIÍOÓÖŐUÚÜŰ]";
        String filteredLine = line.replaceAll(vowels, "");
        return filteredLine;
    }


    public static void main(String[] args) {
        VowelFilter access = new VowelFilter();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/filterVowelsFile.txt"))) {
            System.out.println(access.filterVowels(reader));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }
}