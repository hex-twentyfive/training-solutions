package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

/*    2021-01-13
    Készíts egy WordFilter osztályt, melyben van egy List<String> wordsWithChar(List<String> words, char c) metódus.
    A metódus kiválógatja a paraméterül kapott String listából azokat a szavakat, melyekben előfordul a c karakter,
    majd ezeket visszaadja egy listában.
*/

    public static List<String> wordsWithChar(List<String> words, char c) {

        List<String> wordsWithCar = new ArrayList<>();
        int characterCounter = 0;

        for (String word: words) {
            String[] splittedWord = word.split("");
            characterCounter = 0;
                for (String character: splittedWord) {
                    if (character.equals(String.valueOf(c))) {       //char-t át kell konvertálni String-re, hogy összehasonlítható legyen a String-el!
                        characterCounter++;
                    }
                }
            if (characterCounter > 0) {
                wordsWithCar.add(word);
            }
        }
        return wordsWithCar;
    }


}
