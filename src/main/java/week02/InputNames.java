package week02;

import java.util.Scanner;

public class InputNames {

    int[] nevek = new int[5];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nevek = new String[5];
        for (int i=0; i<nevek.length;i++){
            System.out.println("Kérem adjon meg egy nevet! ");
            nevek[i]=scanner.nextLine();
        }
        for (int i=0; i< nevek.length;i++){
            System.out.println((i+1) +". elem: " + nevek[i]);
        }
    }

}
