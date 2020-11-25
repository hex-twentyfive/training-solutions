package week05d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {

//    Írj egy olyan metódust az week05d03.ListCounter osztályban, mely egy kapott Listából (String) összeszámolja azokat amik 'a' vagy 'A' betűvel kezdődnek,
//    Ha nulla elemű a tömb,vagy nincs benne ilyen elem, akkor 0-t adjon vissza. (edited)

    public int listElementFilter(List<String> list) {
        int firstCaracterMatchCounter = 0;
        for (String elements : list) {
            if ( "a".equals(elements.substring(0,1)) || "A".equals(elements.substring(0,1)) ) {
                firstCaracterMatchCounter++;
            }
        }
        return firstCaracterMatchCounter;
    }


    public static void main(String[] args) {

        List<String> recivedElementsList1 = new ArrayList<>(List.of("Alma", "eper", "ananász", "körte", "avokado", "ribizli", "András"));
        List<String> recivedElementsList2 = new ArrayList<>(List.of("eper", "körte", "ribizli", "sárgabarack", "dinnye"));
        List<String> recivedElementsList3 = new ArrayList<>(List.of());

        ListCounter listCounter = new ListCounter();

        System.out.println("\nElső lista elemei  -->  " + recivedElementsList1);
        System.out.println("Második lista elemei  -->  " + recivedElementsList2);
        System.out.println("Harmadik lista elemei  -->  " + recivedElementsList3 + "  azaz (null elemű tömb)");

        System.out.println("\nAz első list elemeiben hány olyan elem van ami \"a\" vagy \"A\" betűvel kezdődik?  -->  " + listCounter.listElementFilter(recivedElementsList1));
        System.out.println("A második list elemeiben hány olyan elem van ami \"a\" vagy \"A\" betűvel kezdődik?  -->  " + listCounter.listElementFilter(recivedElementsList2));
        System.out.println("A harmadik list elemeiben hány olyan elem van ami \"a\" vagy \"A\" betűvel kezdődik?  -->  " + listCounter.listElementFilter(recivedElementsList3));




}
}
