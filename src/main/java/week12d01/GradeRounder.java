package week12d01;

public class GradeRounder {

/* Készíts egy GradeRounder osztályt, amiben van egy int[] grades roundGrades(int[] grades) metódus.
   A grades tömb pontszámokat tartalmaz 0 és 100 között.
   A feladat az, hogy kerekítsük a benne lévő számokat a következő szabály szerint:
   Ha a pontszám és az 5 következő többszöröse közötti különbség kisebb, mint 3,
   akkor kerekítsük fel a számot az 5 következő többszörösére.
   Fontos: a 40 pont alatti pontszámok elégtelenek, ezeket egyáltalán nem kell kerekíteni.
   Példa: a pontszám 84. 85 - 84 kevesebb mint 3, így felfelé kerekítünk.
 */


    public static int[] roundGrades(int[] grades) {
        int[] roundedNumbers = new int[grades.length];
        for (int i=0; i<grades.length; i++) {
            if ( grades[i] < 40 ) {
                roundedNumbers[i] = grades[i];
            } else if (grades[i] % 5 > 2) {
                roundedNumbers[i] = grades[i] + (5 - (grades[i] % 5));
            } else {
                roundedNumbers[i] = grades[i];
            }
        }
        return roundedNumbers;
    }

    public static int[] roundGradesByAdam(int[] grades) {
        for (int i =0; i<grades.length; i++) {
            if ( grades[i] > 40) {
                int floor = grades[i] / 5;
                int nextCanBeDividedByFiveWithoutResidue = (floor + 1) * 5;
                if (nextCanBeDividedByFiveWithoutResidue - grades[i] < 3  ) {
                    grades[i] = nextCanBeDividedByFiveWithoutResidue;
                }
            }
        }
        return grades;
    }

}
