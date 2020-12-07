package week06d03;

import java.util.ArrayList;
import java.util.List;

/*      A week06d03.WordEraser osztályban
        legyen egy eraseWord(String words, String word) metódus,
        mely az első paraméter szöveget úgy változtatja meg, hogy a második paraméter összes előforulását kitörli belőle.
        A words paraméterben a szavak szóközzel vannak elválasztva.
        A metódus térjen vissza a törölni kívánt szavak nélküli Stringgel.
        (Mellőzzük a replace és replaceAll használatát)
        pl: worlds = "alma körte barack alma szilva körte birsalma"
        word = "alma"
        ==> "körte barack szilva körte birsalma"
        TESZT!!!
*/

public class WordEraser {

    public String eraseWord(String words, String word) {

        StringBuilder remaindWords = new StringBuilder();

        String[] splittedWords = words.split(" ");

        for (String elements: splittedWords) {
            if(!elements.equals(word)) {
                remaindWords.append(elements + " ");
            }
        }
        return remaindWords.toString().trim();          // mert a végén marad egy felesleges " "
    }

}
