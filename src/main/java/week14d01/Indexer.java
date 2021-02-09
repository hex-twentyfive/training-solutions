package week14d01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Indexer {

/*  Készíts egy Indexer osztályt, melynek van egy public Map<Character, List<String>> index(List<String> names) metódusa.
    A feladat az, hogy egy indexet készítsünk a megadott nevek kezdőbetűiből
    (minden kezdőbetűt társítsunk az összes névvel, mely ezzel a betűvel kezdődik).
    Példa:
    System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
    // {A=[Abraham], L=[Lujza], M=[Magdolna], O=[Odon]}
*/

    public Map<Character, List<String>> index(List<String> names) {
        handlesTheException(names);
        Map<Character, List<String>> indexedNames = new HashMap<>();
        for (String name: names) {
            char firstLetter = name.charAt(0);
            if (indexedNames.containsKey(firstLetter)) {
                indexedNames.get(firstLetter).add(name);
            } else {
                indexedNames.put(firstLetter, new ArrayList<>(List.of(name)));
            }
        }
    return indexedNames;
    }

    private void handlesTheException(List<String> names) {
        if (names.isEmpty()) {
            throw new IllegalArgumentException("<!> Empty parameter list is not allowed! <!>");
        }
    }

}