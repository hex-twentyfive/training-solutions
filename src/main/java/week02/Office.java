package week02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        System.out.println("A tárgyalók neve sorrendben: ");
        for (int i = 0; i < meetingRooms.size(); i++) {
            MeetingRoom m = meetingRooms.get(i);
            System.out.println(m.getName());
        }
    }

    public void printNamesReverse() {
        System.out.println("A tárgyalók neve fordított sorrendben: ");
        for (int i = (meetingRooms.size() - 1); i >= 0; i--) {
            MeetingRoom m = meetingRooms.get(i);
            System.out.println(m.getName());
        }
    }

    public void printEventNames() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg, hogy a szűrés páratlan, vagy páros sorszámú tárgylóka történjen! ");
        System.out.println("1. Páratlan");
        System.out.println("2. Páros");
        int p = scanner.nextInt();
        scanner.nextLine();

        if (p == 1) {
            System.out.println("A páratlan sorszámú tárgyalók: ");
        for (int i = 0; i < meetingRooms.size(); i = i + 2) {
            MeetingRoom m = meetingRooms.get(i);
            System.out.println(m.getName());
            }
        }

        if (p == 2) {
            System.out.println("A páros sorszámú tárgyalók: ");
            for (int i = 1; i < meetingRooms.size(); i = i + 2) {
                MeetingRoom m = meetingRooms.get(i);
                System.out.println(m.getName());
            }
        }
    }

    public void printAreas() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            MeetingRoom m = meetingRooms.get(i);
            System.out.println("A(z) " + (i + 1) + ". tárgyaló neve: " + m.getName() + ", hosszúsága: " + m.getLength() + " m, szélessége: " + m.getWidth() + " m, alapterülete: " + m.getArea() + " négyzetméter.");
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom m : meetingRooms) {
            if (name.equals(m.getName())) {
                System.out.println("A(z) " + m.getName() + " nevű tárgyaló hosszúsága: " + m.getLength() + " m, szélessége: " + m.getWidth() + " m, alapterülete: " + m.getArea() + " négyzetméter.");
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        for (MeetingRoom m : meetingRooms) {
            String name = m.getName().toUpperCase();
            String partUpper = part.toUpperCase();
            int index = name.indexOf(partUpper);
            if (index >= 0) {
                System.out.println("A tárgyaló neve: " + m.getName() + ", hoszzúsága: " + m.getLength() + " m, szélessége: " + m.getWidth() + " m, alapterülete: " + m.getArea() + " négyzetméter.");
            }
        }
    }

    public void printAreasLargerThan(int area) {
        System.out.println("A beírt paraméter alapján történő szűrésnek a következő tárgyalok feleltek meg: ");
        for (MeetingRoom m : meetingRooms) {
            int a = m.getArea();
            if (area < a) {
                System.out.println("Név: " + m.getName() + ", hosszúság: " + m.getLength() + " m, szélesség: " + m.getWidth() + " m, alapterület: " + m.getArea() + " négyzetméter.");
            }
        }
    }

}
