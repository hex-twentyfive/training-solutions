package array;

public class ArrayHandler {

    boolean contains(int[] source, int itemToFind) {        //mely visszaadja, hogy a paraméterként megadott érték benne van-e a szintén paramérként átadott tömbben!
        for (int item : source) {
            if (item == itemToFind) {
                return true;
            }
        }
        return false;
    }

    int find(int[] source, int itemToFind) {        //mely visszaadja a paraméterként megadott érték indexét, ha benne van a tömbben, és -1-et, ha nincs benne!
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    ArrayHandler transArrayHandler = new ArrayHandler();

    final int[] testerArray = new int[]{11, 22, 33, 44, 55};
    System.out.println("\nThe tester Array elements are ==> " + testerArray[0] +" "+ testerArray[1] + " "+ testerArray[2] + " "+ testerArray[3] + " "+ testerArray[4]);


    System.out.println("\nIs the tester Array contains the test element? (66)  ==> " + transArrayHandler.contains(testerArray, 66));
    System.out.println("Is the tester Array contains the test element? (33)  ==> " + transArrayHandler.contains(testerArray, 33));


    System.out.println("\nIs the tester Array contains the test element? (66)  ==> " + transArrayHandler.find(testerArray, 66));
    System.out.println("Is the tester Array contains the test element? (33)  ==> " + transArrayHandler.find(testerArray, 33));
    }

}
