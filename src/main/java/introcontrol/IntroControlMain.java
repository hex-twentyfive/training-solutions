package introcontrol;


public class IntroControlMain {
    public static void main(String[] args) {

        IntroControl transIntroControl = new IntroControl();

        System.out.println("Metódus tesztelés (substractTenIfGreaterThanTen) bemeneti érték: (9) ==> kimeneti érték: " + transIntroControl.substractTenIfGreaterThanTen(9));
        System.out.println("Metódus tesztelés (substractTenIfGreaterThanTen) bemeneti érték: (10) ==> kimeneti érték: " + transIntroControl.substractTenIfGreaterThanTen(10));
        System.out.println("Metódus tesztelés (substractTenIfGreaterThanTen) bemeneti érték: (11) ==> kimeneti érték: " + transIntroControl.substractTenIfGreaterThanTen(11));

        System.out.println("\nMetódus tesztelés (describeNumber) bemeneti érték: (-1) ==> kimeneti érték: " + transIntroControl.describeNumber(-1));
        System.out.println("Metódus tesztelés (describeNumber) bemeneti érték: (0) ==> kimeneti érték: " + transIntroControl.describeNumber(0));
        System.out.println("Metódus tesztelés (describeNumber) bemeneti érték: (1) ==> kimeneti érték: " + transIntroControl.describeNumber(1));

        System.out.println("\nMetódus tesztelés (greetingToJoe) bemeneti érték: ('eltérő szöveg') ==> kimeneti érték: " + transIntroControl.greetingToJoe("eltérő szöveg"));
        System.out.println("Metódus tesztelés (greetingToJoe) bemeneti érték: ('Joe') ==> kimeneti érték: " + transIntroControl.greetingToJoe("Joe"));

        System.out.println("\nMetódus tesztelés (calculateBonus) bemeneti érték: (999.999) ==> kimeneti érték: " + transIntroControl.calculateBonus(999_999));
        System.out.println("Metódus tesztelés (calculateBonus) bemeneti érték: (1.000.000) ==> kimeneti érték: " + transIntroControl.calculateBonus(1_000_000));
        System.out.println("Metódus tesztelés (calculateBonus) bemeneti érték: (1.000.010) ==> kimeneti érték: " + transIntroControl.calculateBonus(1_000_010));

        System.out.println("\nMetódus tesztelés (calculateConsumption) bemeneti értékek előző=(9.999) következő=(0) ==> kimeneti érték: " + transIntroControl.calculateConsumption(9_999, 0));
        System.out.println("Metódus tesztelés (calculateConsumption) bemeneti értékek előző=(0) következő=(1) ==> kimeneti érték: " + transIntroControl.calculateConsumption(0, 1));
        System.out.println("Metódus tesztelés (calculateConsumption) bemeneti értékek előző=(9.950) következő=(50) ==> kimeneti érték: " + transIntroControl.calculateConsumption(9_950, 50));

        System.out.println("\nMetódus tesztelés (printNumbers) bemeneti érték: (5) ==> kimeneti érték: ");  transIntroControl.printNumbers(5);

        System.out.println("\nMetódus tesztelés (printNumbersBetween) bemeneti érték min=(7) max=(11) ==> kimeneti érték: ");  transIntroControl.printNumbersBetween(7, 11);

        System.out.println("\nMetódus tesztelés (printNumbersBetweenAnyDirection) bemeneti érték min=(8) max=(10) (növekvő sorrend) ==> kimeneti érték: ");  transIntroControl.printNumbersBetweenAnyDirection(8, 10);
        System.out.println("\nMetódus tesztelés (printNumbersBetweenAnyDirection) bemeneti érték min=(10) max=(8) (csökkenő sorrend) ==> kimeneti érték: ");  transIntroControl.printNumbersBetweenAnyDirection(10, 8);

        System.out.println("\nMetódus tesztelés (printOddNumbers) bemeneti érték: (7) ==> kimeneti érték: ");  transIntroControl.printOddNumbers(7);
        System.out.println("\nMetódus tesztelés (printOddNumbers) bemeneti érték: (10) ==> kimeneti érték: ");  transIntroControl.printOddNumbers(10);
    }
}
