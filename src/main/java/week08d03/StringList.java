package week08d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList {

    /*  Készíts week08d03 csomagban egy StringLists osztályt és benne egy
        stringListsUnion(List<String> first, List<String> second) metódust,
        mely két string listát vár paraméterül és visszaadja az uniójukat.
        Az úniónak minden elemet tartalmaznia kell mindkét listából,
        de egy elem nem szerepelhet kétszer! Feltételezhetjük, hogy az egyes
        listákban minden elem legfejjebb egyszer fordul elő.
        first: "a" "b" "c"    second: "a" "d"    unio: "a" "b" "c" "d"
    */

    public static List<String> stringListUnion(List<String> fist, List<String> second) {

        List<String> unionOfLists = new ArrayList<>(fist);

        for (String element: second) {
            if (!unionOfLists.contains(element)) {
                unionOfLists.add(element);
            }
        }

        Collections.sort(unionOfLists);     //a rendezés a tesztelést egyszerűsíti meg.
        return unionOfLists;
    }

}
