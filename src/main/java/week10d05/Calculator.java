package week10d05;

import java.util.Arrays;

public class Calculator {

/*  2021-01-08
    Készítsünk egy Calculator nevű osztályt, melynek van egy findMinSum(int[] arr) metódusa. A metódus feladata,
    hogy kiírja a legkisebb összegeket 4 számból, amiket lehetséges összerakni az arr tömb elemeiből.
    Példa: ha az arr tartalma [1, 3, 5, 7, 9], akkor a minimum összeg 1+3+5+7=16.
*/

    public static int findMinSum(int[] arr) {
        if (arr.length < 4) {
            throw new IllegalArgumentException("the number of arr[] elements cannot be less than four!");
        }

        Arrays.sort(arr);
        int arrMinSum = arr[0] + arr[1] + arr[2] + arr[3];

        return arrMinSum;
    }


}
