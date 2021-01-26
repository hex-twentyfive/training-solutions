package week12d03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {

/*    Készítsd el a week12d03.NumberStat osztályt melyben legyen egy metódus, ami paraméterül vár egy egész számokból álló listát.
      Add vissza azt a számot amelyik pontosan egyszer szerepel a listában. Ha több ilyen szám van akkor a kisebbet!
      Ellenőrizd, hogy olyan listát fogadunk el, ami legalább 1 elemű, ha a lista nem ilyen, dobj kivételt!
      pl: {1,1,5,3,4,5,6,5,6,4,1,6,5,4} A megoldás: 3
      Bónusz: Módosítsd az osztályt. Legyen egy egész számokból álló lista attribútuma.
      A fent megírt metódus ezen a listán dolgozzon. A lista elemeit fájlból töltsük fel.
      A file úgy néz ki, hogy egy sorban három szám van vesszővel elválasztva. Tehát:
      1,1,4
      2,3,5
      2,2,5
*/
    private List<Integer> fileNumberContent = new ArrayList<>();

    public int smallestLoneNumber(List<Integer> listOfNumbers) {

        if (listOfNumbers.isEmpty()) {
            throw new NullPointerException("The list must have at least one element!");
        }

        List<Integer> sortedNumbers = new ArrayList<>(listOfNumbers);
        Collections.sort(sortedNumbers);

        for (int number: sortedNumbers) {
            int repeat = 0;
            for (int compareNumber: sortedNumbers) {
                if (compareNumber == number) {
                    repeat ++;
                }
            }
            if (repeat == 1) {
                return number;
            }
        }
        throw new IllegalStateException("There is no lone number in the input list !");
    }

    public void fileReader() {
        Path fileLocation = Path.of("src/main/resources/week/week12d03/numbers.txt");
        try {
            List<String> numbers = Files.readAllLines(fileLocation);
            for (String row: numbers) {
                String[] stringNumbers  = row.split(",");
                    for (String number: stringNumbers ) {
                        fileNumberContent.add(Integer.parseInt(number));
                    }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read the file!", e);
        }
    }

    public List<Integer> getFileNumberContent() {
        return fileNumberContent;
    }

}
