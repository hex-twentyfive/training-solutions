package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString() {                                         //, és add vissza String-ként egy utasítással az értékeit.

        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek() {                                            //A List<String> daysOfWeek() metódus adja vissza a napok neveit!

        List<String> dayOfWeek = new ArrayList<>(List.of("Hétfo", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"));

        return dayOfWeek;
    }

    public String multiplicationTableAsString(int size)  {                         //A multiplicationTableAsString(int size) metódus definiáljon egy size méretű szorzótáblát, és adja vissza az értékeket String-ként egy sorban.

        int[][] multiplicationTable = new int[size][size];

        for ( int i = 0 ; i < size ; i++ ) {
            for ( int j =0 ; j < size ; j++ ) {
                multiplicationTable[i][j] = ( i + 1 ) * ( j + 1 );
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {               //hőmérsékleti értékeket vár, órai mérésekkel, két napra. Vizsgáld meg, hogy a paraméterként megadott két nap azonos méréseket tartalmazott-e!

        boolean compareDaysTemp = Arrays.equals(day,anotherDay);

        return compareDaysTemp;
    }

    boolean wonLottery(int[]lotteryNumber1, int[]lotteryNumber2) {

        Arrays.sort(lotteryNumber1);
        Arrays.sort(lotteryNumber2);

        return Arrays.equals(lotteryNumber1, lotteryNumber2);
    }

    public static void main(String[] args) {

        int multiplicationNumber = 5;

        double[] day1 = { 4, 5, 7.5, 9.5, 6.5};
        double[] day2 = { 4, 5, 8, 10.5, 8};
        double[] day3 = { 4, 5, 8, 10.5, 8};

        int[] lotteryNumbers1 = {5,25,9,7,45};
        int[] lotteryNumbers2 = {25,7,9,5,44};
        int[] lotteryNumbers3 = {25,7,9,5,44};

        ArraysMain instArraysMain = new ArraysMain();

        System.out.println("\nHány nap van a hónapokaban?  -->  " + instArraysMain.numberOfDaysAsString());

        System.out.println("\nA napok elnevezései  -->  " + instArraysMain.daysOfWeek());

        System.out.println("\nSzorzótábla tömb [5]-ös  -->  " + instArraysMain.multiplicationTableAsString(multiplicationNumber));

        System.out.println("\nAz első nap hőmérsékletadatai megegyeznek a második nap hőmérsékletadataival?  -->  " + instArraysMain.sameTempValues(day1,day2));
        System.out.println("Az második nap hőmérsékletadatai megegyeznek a harmadik nap hőmérsékletadataival?  -->  " + instArraysMain.sameTempValues(day2,day3));

        System.out.println("\nElső kihúzott számok megegyeznek a második kihúzott számokkal?  -->  " + instArraysMain.wonLottery(lotteryNumbers1,lotteryNumbers2));
        System.out.println("Második kihúzott számok megegyeznek a harmadik kihúzott számokkal?  -->  " + instArraysMain.wonLottery(lotteryNumbers2,lotteryNumbers3));

    }
}
