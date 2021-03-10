package week15d02;


/*  Adott egy vetélkedő kérdésbankja egy fájlban.(examples/week15d02/kerdesek.txt)
    A fájlban az egy kérdéshez tartozó adatok két sorban helyezkednek el. Első sorban a kérdés,
    a második sorban a válasz a pontszám és a téma, szóközzel elválasztava.
    Olvasd be a fájl tartalmát a memóriába, majd oldjátok meg a lenti feladatokat.

    file minta: Mikor volt a mohacsi vesz?                      //első sor
                1526 1 tortenelem                               // második sor // válasz / pontszám / téma
                Melyik evben bomlott fel a Nyugat-Romai Birodalom?
                476 1 tortenelem

    1. Írj egy metódust, melynek paramétere a téma és add vissza, az összes kérdést abban a témában. (Csak a kérdéseket)
    2. Írj egy metódust, ami random sorsol ki egy kérdést, és adja vissza annak összes adatát.
    3. Készíts egy metódust ami rendszerezi a kérdéseket témakörönként.
       Visszatér egy adatszerkezetben amelyben témánként megtalálható az összes kérdés, összes adata.
    4. Az előző feladat segítségével határozd meg, hogy melyik téma kérdései érik a legtöbb pontot (összpontszám)!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Quiz {

    private List<QuizQuestion> questions = new ArrayList<>();

    public void readTheFileWithQuestions(BufferedReader reader) {
        try {
            String line;
            while ((line = reader.readLine()) != null) {
            String[] split = readEverySecondLineAndSplit(reader);
                questions.add(new QuizQuestion(line, split[0], Integer.parseInt(split[1]), split[2]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

    private String[] readEverySecondLineAndSplit(BufferedReader reader) throws IOException {
        String secondLine = reader.readLine();
        String[] split = secondLine.split(" ");
        return split;
    }


    public List<String> returnQuestionsByTopic(String topic) {          //1.
        List<String> result = new ArrayList<>();
        for (QuizQuestion e: questions) {
            if (e.getTopic().equals(topic)) {
                result.add(e.getQuestion());
            }
        }
        return result;
//        sortsTheQuestionsAndListsThem(result);          // 1.v2
    }

    private void sortsTheQuestionsAndListsThem(List<String> input) {    //1.v2 --> Ha közvetlenül ki akarjuk iratni a kérdéseket konzolra sortöréssel.
        for (String e: input) {
            System.out.println(e);
        }
    }


    public List<QuizQuestion> randomlyDrawsAQuestion() {                            //2.
        List<QuizQuestion> result = new ArrayList<>();
        int rnd = new Random().nextInt(questions.size());           // Ha tesztelni szeretnénk, akkor érdemes a random-ot paraméterként átadni
        result.add(questions.get(rnd));
        return result;
    }


    public Map<String, List<QuizQuestion>> systematizesTheQuestionsByTopic() {                     //3.
        Map<String, List<QuizQuestion>> result = new HashMap<>();
        for (QuizQuestion e: questions) {
            if (!result.containsKey(e.getTopic())) {
                result.put(e.getTopic(), new ArrayList<>(List.of(e)));
            } else {
             List<QuizQuestion> temp = result.get(e.getTopic());
             temp.add(e);
             result.put(e.getTopic(), temp);            // vagy összevonva // result.put(e.getTopic(), result.get(e.getTopic()).add(e));
            }
        }
//        listTheQuestionsByTopic(result);          // 3.v2
        return result;
    }

    private void listTheQuestionsByTopic(Map<String, List<QuizQuestion>> input) {      //3.v2 --> Ha közvetlenül ki akarjuk iratni a kérdéseket konzolra sortöréssel.
        for (Map.Entry<String, List<QuizQuestion>> entry: input.entrySet()) {
            System.out.println(entry);
        }
    }


    public Map.Entry<String, Integer> countTheScoreSumByTopic() {             //4.
        Map<String, Integer> result = new HashMap<>();
        for (QuizQuestion e: questions) {
            if (!result.containsKey(e.getTopic())) {
                result.put(e.getTopic(), 1);
            } else {
               int tempScoreSum = result.get(e.getTopic()) + e.getScore();
                result.put(e.getTopic(), tempScoreSum);
            }
        }
        return determinesTheHighestValue(result);
    }

    private Map.Entry<String, Integer> determinesTheHighestValue(Map<String, Integer> input) {      //4.2.
        Map.Entry<String, Integer> result = null;
        for (Map.Entry<String, Integer> entry: input.entrySet()) {
            if ( result == null || entry.getValue() > result.getValue()) {
                result = entry;
            }
        }
        return result;
    }


    public List<QuizQuestion> getQuestions() {
        return questions;
    }


    public static void main(String[] args) {
        Quiz access = new Quiz();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/kerdesek.txt"))) {
            access.readTheFileWithQuestions(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }

        System.out.println(access.returnQuestionsByTopic("matematika"));      //1.
        System.out.println("=====");
        System.out.println(access.randomlyDrawsAQuestion().toString());           //2.
        System.out.println("=====");
        System.out.println(access.systematizesTheQuestionsByTopic());       //3.
        System.out.println("=====");
        System.out.println(access.countTheScoreSumByTopic().toString());        //4.
        System.out.println("=====");
    }

}