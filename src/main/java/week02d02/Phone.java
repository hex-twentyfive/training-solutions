package week02d02;

import java.util.Scanner;

public class Phone {
    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg az első telefon típusát!");
        String phoneType1 = scanner.nextLine();
        System.out.println("Kérem adja meg az első telefon memóriájának mennyiségét!");
        int phoneMem1 = scanner.nextInt();

        String technicalScanning = scanner.nextLine();
        System.out.println("Kérem adja meg a második telefon típusát!");
        String phoneType2 = scanner.nextLine();
        System.out.println("Kérem adja meg a második telefon memóriájának mennyiségét!");
        int phoneMem2 = scanner.nextInt();


        Phone Phone1 = new Phone(phoneType1, phoneMem1);
        Phone Phone2 = new Phone(phoneType2, phoneMem2);

        //Phone Phone1 = new Phone("Samsung S20", 128);
        //Phone Phone2 = new Phone("LG G6", 128);

        System.out.println("1st Mobile: " + Phone1.type + " with " + Phone1.mem + " GB");
        System.out.println("2nd Mobile: " + Phone2.type + " with " + Phone2.mem + " GB");

    }
}
