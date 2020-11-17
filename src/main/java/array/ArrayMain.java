package array;

public class ArrayMain {
    public static void main(String[] args) {

       String[] dayOfTheWeek = { "hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap" };

        System.out.println("A tömb második eleme: " + dayOfTheWeek [1]);
        System.out.println("A tömb hossza: " + dayOfTheWeek.length);
        System.out.println("");

        int [] fiveElementLongArray = new int[5];

        fiveElementLongArray[0] = 1;
        for (int i = 1; i < fiveElementLongArray.length; i++) {
            fiveElementLongArray[i] = fiveElementLongArray[i - 1] * 2;
        }

        for (int i = 0; i < fiveElementLongArray.length; i++) {
            System.out.println(fiveElementLongArray[i]);
        }

        System.out.println("");

        boolean [] sixElementBooleanArray = new boolean[6];

        sixElementBooleanArray[0] = false;
        for (int i = 1; i < sixElementBooleanArray.length; i++) {
            sixElementBooleanArray[i] = !sixElementBooleanArray[i-1];
        }

        for (int i = 0; i < sixElementBooleanArray.length; i++) {
            System.out.println(sixElementBooleanArray[i]);
        }

    }

}
