package week02;

import java.util.Arrays;
import java.util.List;

public class Languages {

    public static void main(String[] args) {

        String[] programingLanguagesArray = {"Java", "Python", "JavaScript"};
        List<String> programingLanguages = Arrays.asList(programingLanguagesArray);

        System.out.println("A tömb tartalma: ");
        for (String looksArroundOriginalList : programingLanguages) {
            System.out.print(looksArroundOriginalList + ", ");
        }

        System.out.println("\n\nAz öt karakternél hoszabb programozási nyelvek a következők: ");
        for (String looksArroundSelection : programingLanguages) {
            if (looksArroundSelection.length() > 5) {
                System.out.println(looksArroundSelection);
            }
        }

    }
}

