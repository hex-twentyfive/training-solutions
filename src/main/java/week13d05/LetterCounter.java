package week13d05;

import java.util.HashSet;
import java.util.Set;

public class LetterCounter {

/*  Írj egy metódust, amely megszámolja, hogy hány különböző betű van egy szóban.
    A kis és nagybetűk közötti különbség nem számít! A space-eket, számjegyeket, stb.
    ne vegye figyelembe! Csak az angol ábécé betűit!
*/


    public int countTheLetter(String word) {
        handlesTheExceptions(word);
        String transformedWord = transformTheWord(word);
        Set<Character> characters = new HashSet<>();            //a Set-ben nem lehet ismétlődés nincs szükség ellenörző műveletekre
        char[] wordCharacters = transformedWord.toCharArray();
        for (char character : wordCharacters) {
            characters.add(character);
        }
        return characters.size();
    }

    private String transformTheWord(String word) {
        String wordWithoutUpperChase = word.toLowerCase();
        String wordWithoutSpace = wordWithoutUpperChase.replaceAll("\\s", "");
        String wordWithoutNumbers = wordWithoutSpace.replaceAll("[0-9]", "");
        return wordWithoutNumbers;
    }

    private void handlesTheExceptions(String word) {
        if (word == null || word == "" || word.length() > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Parameter with null or empty value is not allowed!");
        }
        if (word.length() > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("The input word is too long!");
        }
    }

    private boolean isEnglishChar(char character) {
        return (character >= 'a' && character <= 'z');
    }

}