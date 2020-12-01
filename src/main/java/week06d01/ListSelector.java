package week06d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelector {


    public String everySecondElementOfList(List<String> inputList) {

        StringBuilder selectedElements = new StringBuilder();

        if (inputList == null) {
            throw new IllegalArgumentException("List with \"null\" value is not acceptable!");
        }
        if (Arrays.asList().equals(inputList)) {
            return "";
        }
        else {
            selectedElements.append("[");
            for (int i = 0; i < inputList.size(); i++ ) {           // i += 2
                if ( i % 2 == 0) {
                selectedElements.append(inputList.get(i));
                }
            }
        }
        return selectedElements.append("]").toString();
    }


    public static void main(String[] args) {

        ListSelector lS = new ListSelector();

        List<String> testList = new ArrayList<>(Arrays.asList("alma", "kabát", "Géza", "kilóméter", "csütörtök"));
        List<String> testList2 = new ArrayList<>(Arrays.asList());

        System.out.println("\n" + testList);
        System.out.println("\n" + testList2.toString());
        System.out.println("\n" + lS.everySecondElementOfList(testList));
        System.out.println("\n" + lS.everySecondElementOfList(testList2));

    }

}
