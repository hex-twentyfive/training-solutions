package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {

        int capacityOfBoat1 = 5;
        int capacityOfBoat2 = 3;
        int capacityOfBoat3 = 2;
        int rentalCapacity = capacityOfBoat1 + capacityOfBoat2 + capacityOfBoat3;
        int numberOfWaittings;
        int remainingCapacity;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mekkora létszámú a csónakkölcsönzőbe érkezett csoport?");
        int groupSize = scanner.nextInt();

        if (rentalCapacity >= groupSize) {
                numberOfWaittings = 0;
        }   else {
                numberOfWaittings = groupSize - rentalCapacity;
        }

        if ( groupSize == 1 || groupSize == 2 )  {
            System.out.println("\nA 2 személyes csónak lett kiadva. Az 5 és a 3 személyes csónakok tovább várakoznak. A kiadható férőhelyek száma: (8)  A fennmaradt várakozó emberek száma: (" + numberOfWaittings + ")" );
        }

        if (groupSize == 3) {
            System.out.println("\nA 3 személyes csónak lett kiadva. Az 5 és a 2 személyes csónakok tovább várakoznak. A kiadható férőhelyek száma: (7)  A fennmaradt várakozó emberek száma: (" + numberOfWaittings + ")" );
        }

        if (groupSize == 4 || groupSize == 5) {
            System.out.println("\nAz 5 személyes csónak lett kiadva. A 3 és a 2 személyes csónakok tovább várakoznak. A kiadható férőhelyek száma: (5)  A fennmaradt várakozó emberek száma: (" + numberOfWaittings + ")" );
        }

        if (groupSize == 6 || groupSize == 7 ) {
            System.out.println("\nAz 5 és a 2 személyes csónakok lettek kiadva. A 3 személyes csónak tovább várakozik. A kiadható férőhelyek száma: (3)  A fennmaradt várakozó emberek száma: (" + numberOfWaittings + ")" );
        }

        if (groupSize == 8) {
            System.out.println("\nAz 5 és a 3 személyes csónakok lettek kiadva. A 2 személyes csónak tovább várakozik. A kiadható férőhelyek száma: (2)  A fennmaradt várakozó emberek száma: (" + numberOfWaittings + ")" );
        }

        if (groupSize >= 9) {
            System.out.println("\nAz 5, a 3 és a 2 személyes csónakok lettek kiadva. Nincs további kiadható csónak. A kiadható férőhelyek száma: (0)  A fennmaradt várakozó emberek száma: (" + numberOfWaittings + ")" );
        }

    }
}
