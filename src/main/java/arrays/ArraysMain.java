package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek() {
        String[] days = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        return Arrays.asList(days);
    }

    public String multiplicationTableAsString(int size){
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i+1) * (j+1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int sorterDay = Math.min(day.length,anotherDay.length);
        Arrays.copyOfRange(day, 0, sorterDay);
        Arrays.copyOfRange(anotherDay, 0, sorterDay);

        return Arrays.equals(Arrays.copyOfRange(day, 0, sorterDay),  Arrays.copyOfRange(anotherDay, 0, sorterDay));
    }

    private int[] placedNumber;
    private int[] drawnNumber;

    public boolean wonLottery(int[] placedNumber, int[] drawnNumber) {
        this.placedNumber = Arrays.copyOf(placedNumber, placedNumber.length);
        this.drawnNumber = Arrays.copyOf(drawnNumber, drawnNumber.length);
        Arrays.sort(this.placedNumber);
        Arrays.sort(this.drawnNumber);

        return Arrays.equals(this.placedNumber, this.drawnNumber);
    }

    public static void main(String[] args) {

        ArraysMain instArraysMain = new ArraysMain();

        System.out.println(instArraysMain.numberOfDaysAsString());
        System.out.println(instArraysMain.daysOfWeek());

        System.out.println(instArraysMain.multiplicationTableAsString(8));

        double[] a = {23, 25, 27, 32};
        double[] b = {24, 26, 27, 33};
        double[] c = {22, 23, 26, 30};
        double[] d = {22, 23, 26, 30};

        System.out.println(instArraysMain.sameTempValues(a, b));
        System.out.println(instArraysMain.sameTempValues(c, d));

        double[] w = {23, 20, 19, 16};
        double[] x = {23, 20, 19};
        double[] y = {24, 22, 19};

        System.out.println(instArraysMain.sameTempValuesDaylight(w, x));
        System.out.println(instArraysMain.sameTempValuesDaylight(w, y));

        int[] placedFirst = {81, 57, 85, 59, 84};
        int[] drawnNumber1 = {45, 76, 43, 86, 57};
        int[] placedSecond = {19, 29, 5, 23, 2};
        int[] drawnNumber2 = {2, 29, 23, 19, 5};

        System.out.println(instArraysMain.wonLottery(placedFirst, drawnNumber1));
        System.out.println(instArraysMain.wonLottery(placedSecond, drawnNumber2));
        System.out.println(Arrays.toString(placedFirst));
        System.out.println(Arrays.toString(drawnNumber1));
        System.out.println(Arrays.toString(placedSecond));
        System.out.println(Arrays.toString(drawnNumber2));
    }

}
