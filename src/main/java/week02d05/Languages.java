package week02d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Languages {

    public static void main(String[] args) {

        List<String> programingLanguages = new ArrayList<>();
        programingLanguages.add("Java");
        programingLanguages.add("Python");
        programingLanguages.add("JavaScript");


        System.out.println("A lista tartalma: ");
        for (String looksAroundOriginalList : programingLanguages) {
            System.out.print(looksAroundOriginalList + ", ");
        }

        System.out.println("\n\nAz öt karakternél hoszabb programozási nyelvek a következők: ");
        for (String looksAroundSelection : programingLanguages) {
            if (looksAroundSelection.length() > 5) {
                System.out.println(looksAroundSelection);
            }
        }

    }

}

