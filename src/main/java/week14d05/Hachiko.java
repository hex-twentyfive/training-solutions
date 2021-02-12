package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

/*  A examples/week14d05/hachiko.srt van a Hachiko film felirata. Írj egy countWords() metódust,
    mely paraméterül várja a fájlt, varargsban szavakat. Megszámolja,
    hogy melyik szó hány sorban szerepel a szövegben.
    Legyenek mondjuk a beadott szavak: "Hachiko", "haza", "pályaudvar", "jó"
*/

public class Hachiko {

    public Map<String, Integer> countWords(Path fileLocation, String...words) {
        Map<String, Integer> result = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = Files.newBufferedReader(fileLocation, Charset.forName("windows-1250"))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                countWordsInLines(result, line, words);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
        result = sortTheMapInOrderOfArrival(result, words);
        return result;
    }

    public void countWordsInLines(Map<String, Integer> result, String line, String...words) {
        for (String word: words) {
            if(line.toLowerCase().contains(word.toLowerCase())) {
                contentChecker(result, word);
            }
        }
    }

    private void contentChecker(Map<String, Integer> result, String word) {
        if(result.containsKey(word)) {
            result.put(word, result.get(word) + 1);
        } else {
            result.put(word, 1);
        }
    }

    public Map<String, Integer> sortTheMapInOrderOfArrival(Map<String, Integer> result, String...words) {
        Map<String, Integer> orderedMap = new LinkedHashMap<>();
        for (String word: words) {
            orderedMap.put(word, result.get(word));
        }
        return orderedMap;
    }


    public static void main(String[] args) {
        Hachiko access = new Hachiko();
        Path fileLocation = Path.of("src/main/resources/hachiko.srt");

        System.out.println(access.countWords(fileLocation, "Hachiko", "haza", "pályaudvar", "jó", "kutyus"));
    }

}