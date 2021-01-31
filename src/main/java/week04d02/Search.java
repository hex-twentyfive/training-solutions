package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

/*  A Search osztályban írj egy getIndexesOfChar() metódust, mely első paraméterként vár egy String értéket,
    második paraméterként egy char értéket! Visszaad egy listát, melyben visszaadja,
    hogy a karakter hanyadik indexeken szerepel az első paraméterként átadott listában.
    Pl.: almafa szóban a a karakter: 0, 3, 5.
*/

   public List<Integer> getIndexOfChar(String word, char c) {
       List<Integer> positionList = new ArrayList<>();
       String[] splitWord = word.split("");
       for (int i=0; i<word.length(); i++) {
           if (splitWord[i].equals(String.valueOf(c))) {
               positionList.add(i);
           }
       }
       return positionList;
   }

}
