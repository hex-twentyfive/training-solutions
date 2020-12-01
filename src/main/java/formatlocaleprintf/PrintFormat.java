package formatlocaleprintf;

import java.util.IllegalFormatException;

public class PrintFormat {

    public String checkException(String formatString, Integer i, Integer j) {
        try {
            return String.format(formatString, i, j);
        } catch (IllegalFormatException ife) {
            throw new IllegalArgumentException("Parameter missing in String format!");
        }
    }

    public String printFormattedTextDouble(Double number) {
        return String.format("Total in decimal fraction: %8.2f", number);
    }

    public String printFormattedTextFruit(int count, String fruit) {
        return String.format("The cargo is: %d barrel of %s", count, fruit);
    }

    public String printFormattedTextNumber(int number) {
        return String.format("Right edge of numbers set at 4 spaces from text:%4d", number);
    }

    public String printFormattedTextInteger(Integer i, Integer j, Integer k) {
        return String.format("Multiple objects containing text:%d\t%d\t%d", i, j, k);
    }


    public static void main(String[] args) {

        PrintFormat pf = new PrintFormat();

        System.out.println(pf.printFormattedTextDouble(25.10));
        System.out.println(pf.printFormattedTextFruit(25, "avocado"));
        System.out.println(pf.printFormattedTextNumber(25));
        System.out.println(pf.printFormattedTextInteger(10,11,12));
    }
}