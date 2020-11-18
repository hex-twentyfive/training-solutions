package arrayofarrays;

import java.util.Scanner;

public class ArrayOfArraysMain {


    public int[][] multiplicationTable(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return multiplicationTable;
    }

    public void printArrayOfArrays(int[][] a) {
        for (int i[] : a) {
            for (int j : i) {
                if (j < 10) {
                    System.out.print("  ");
                } else if (j < 100) {
                    System.out.print(" ");
                }
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int[][] triangularMatrix(int size) {
        int[][] triangularMatrix = new int[size][];
        for (int i = 0; i < triangularMatrix.length; i++) {
            triangularMatrix[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangularMatrix[i][j] = i;
            }
        }
        return triangularMatrix;
    }

    public int[][] getValues() {
        int[][] values = new int[12][];
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < numberOfDays.length; i++) {
            values[i] = new int[numberOfDays[i]];
        }
        return values;
    }

    public static void main(String[] args) {

        ArrayOfArraysMain transArrayOfArraysMain = new ArrayOfArraysMain();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy számot, ami alapján a tömb ábrázolások megtörténnek! ");
        int inputNumber = scanner.nextInt();

        System.out.println("\nSzorzótábla: ");
        transArrayOfArraysMain.printArrayOfArrays(transArrayOfArraysMain.multiplicationTable(inputNumber));

        System.out.println("\nHáromszög mátrix ábrázolása: ");
        transArrayOfArraysMain.printArrayOfArrays(transArrayOfArraysMain.triangularMatrix(inputNumber));

        System.out.println("\nÉv nap érték: ");
        transArrayOfArraysMain.printArrayOfArrays(transArrayOfArraysMain.getValues());

    }
}
