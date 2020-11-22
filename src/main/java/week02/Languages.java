package week02;

import java.util.Arrays;
import java.util.List;

public class Languages {

    public static void main(String[] args) {

        String[] programingLanguagesArray = {"Java", "Python", "JavaScript"};
        List<String> programingLanguagesList = Arrays.asList(programingLanguagesArray);

        System.out.println("A tömb tartalma: ");
        for (String looksArround : programingLanguagesList) {
            System.out.print(looksArround + ", ");
        }

        System.out.println("\n\nAz öt karakternél hoszabb programozási nyelvek a következők: ");
        for (String looksArround : programingLanguagesList) {
            if (looksArround.length() > 4) {
                System.out.println(looksArround);
            }
        }

    }
}

