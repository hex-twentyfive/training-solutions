package week02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    Office office = new Office();

    public void readOffice() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a rögzíteni kívánt tárgyalók mennyiségét! ");
        int targyalokSzama = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < targyalokSzama; i++) {
            System.out.println("Kérem adja meg a(z) " + (i + 1) + ". tárgyaló nevét! ");
            String name = scanner.nextLine();
            System.out.println("Kérem adja meg a(z) " + (i + 1) + ". tárgyaló hosszúságát méterben! ");
            int length = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérem adja meg a(z) " + (i + 1) + ". tárgyaló szélességét méterben! ");
            int width = scanner.nextInt();
            scanner.nextLine();

            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);

            meetingRoom.setName(name);
            meetingRoom.setLength(length);
            meetingRoom.setWidth(width);

            office.addMeetingRoom(meetingRoom);
        }
    }

    public void printMenu() {

        List<String> menu = new ArrayList<>();

        menu.add("1. Tárgyalók sorrendben");
        menu.add("2. Tárgyalók visszafele sorrendben");
        menu.add("3. Minden második tárgyaló");
        menu.add("4. Területek");
        menu.add("5. Keresés pontos név alapján");
        menu.add("6. Keresés névtöredék alapján");
        menu.add("7. Keresés terület alapján");

        System.out.println("Menü: ");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }
    }

    public void runMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, válasszon egy menüpontot! ");
        int menuPont = scanner.nextInt();
        scanner.nextLine();

        if (menuPont == 1) {
            office.printNames();
        }

        if (menuPont == 2) {
            office.printNamesReverse();
        }

        if (menuPont == 3) {
            office.printEventNames();
        }

        if (menuPont == 4) {
            office.printAreas();
        }

        if (menuPont == 5) {
            System.out.println("Kérem, adja meg, hogy milyen név alapján történjen a keresés! ");
            String nev = scanner.nextLine();

            office.printMeetingRoomsWithName(nev);
        }

        if (menuPont == 6) {
            System.out.println("Kérem, adja meg, hogy milyen névtöredék alapján történjen a keresés! ");
            String nevToredek = scanner.nextLine();

            office.printMeetingRoomsContains(nevToredek);
        }

        if (menuPont == 7) {
            System.out.println("Kérem, adja meg mekkora terület alapján történjen a keresés! ");
            int terulet = scanner.nextInt();
            scanner.nextLine();

            office.printAreasLargerThan(terulet);
        }
    }

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }
}
