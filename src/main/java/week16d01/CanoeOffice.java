package week16d01;

import java.time.LocalDateTime;
import java.util.*;

/*  Írj egy olyan CanoeRental osztályt, amely String name, CanoeType canoeType, LocalDateTime startTime,
    LocalDateTime endTime attribútumokban tárolja egy kenu kölcsönzés kölcsönzési adatait.
    A CanoeType egy enum, mely értékei: RED, GREEN és BLUE.
        Publikus metódusok:
            public CanoeRental(String name, CanoeType canoeType, LocalDateTime startTime)
            public void setEndTime(LocalDateTime endTime)
            public double calculateRentalSum()

    Minden kölcsönzés aktív, amíg vissza nem hozták a kenut, azaz ki nem töltötték az endTime értékét.

    Írj egy CanoeOffice osztályt, mely tárolja, hogy milyen kölcsönzések történtek (List<CanoeRental>).
    A következő metódusokat implementáld:
    1. addRental(CanoeRental) - hozzáad egy kölcsönzést
    2. findRentalByName(String name) - megkeres egy AKTÍV kölcsönzést név alapján
    3. closeRentalByName(String name, LocalDateTime endTime) - megkeres egy AKTÍV kölcsönzést név alapján, beállítja az endTime értékét
    4. double getRentalPriceByName(String name, LocalDateTime endTime) - kikeresi az AKTÍV kölcsönzést név alapján,
        és kiszámolja, hogy a megadott kölcsönzés mennyibe kerülne. A számolás úgy történik,
        hogy óránként 5000 Ft-ot a szín alapján megszoroz egy értékkel, piros, zöld és kék esetén rendre
        1, 1,2 és 1,5 értékkel. Minden megkezdett óra számít.
    5. List<CanoeRental> listClosedRentals() - Add vissza a lezárt kölcsönzéseket a startTime alapján sorbarendezve!
    6. Map<CanoeType, Integer> countRentals() - Számold meg, hány kölcsönzés volt színenként!
 */

public class CanoeOffice {

    private List<CanoeRental> canoeRentals = new ArrayList<>();

    public void addRental(CanoeRental canoeRental) {        //1.
        canoeRentals.add(canoeRental);
    }

    public CanoeRental findRentalByName(String name) {      //2.    //csak Aktív
        for (CanoeRental e: canoeRentals) {
            if (name.equals(e.getName()) && isActive(e)) {
                return e;
            }
        }
        throw new IllegalArgumentException("There is no canoe reservation with this name!");
    }

    private boolean isActive(CanoeRental input) {       //Addig aktív, amíg nincs lezárási ideje
        return  input.getEndTime() == null;
    }

    public void closeRentalByName(String name, LocalDateTime endTime) {         //3.    //csak Aktív
        findRentalByName(name).setEndTime(endTime);
    }

    public double getRentalPriceByName(String name, LocalDateTime endTime) {        //4.    //csak Aktív
        CanoeRental canoeRental = findRentalByName(name);
        canoeRental.setEndTime(endTime);
        return (canoeRental.calculateRentalSum() + 1) * canoeRental.getCanoeType().getPriceRate();      // A calculateRentalSum()-hoz hozzá kell adni egyet, mert lefele kerekít
    }

    public List<CanoeRental> listClosedRentals() {                   //5.     //csak a lezártakat   //sorba rendezve idő szerint
        List<CanoeRental> closedRentals = new ArrayList<>();
        for (CanoeRental e: canoeRentals) {
            if (!isActive(e)) {                     //Tehát nem aktív
                closedRentals.add(e);
            }
        }
        return comparingByStartTime(closedRentals);
    }

    private List<CanoeRental> comparingByStartTime(List<CanoeRental> originalList) {
        List<CanoeRental> orderedCanoeRentals = originalList;
        Collections.sort(orderedCanoeRentals, new Comparator<CanoeRental>() {
            @Override
            public int compare(CanoeRental o1, CanoeRental o2) {
                return o1.getStartTime().compareTo(o2.getStartTime());
            }
        });
    return orderedCanoeRentals;
    }

    public Map<CanoeType, Integer> countRentals() {             //6.
        Map<CanoeType, Integer> result = new HashMap<>();
        for (CanoeRental e: canoeRentals) {
            if(!result.containsKey(e.getCanoeType())) {
                result.put(e.getCanoeType(), 1);
            } else {
                result.put(e.getCanoeType(),result.get(e.getCanoeType()) + 1);
            }
        }
        return result;
    }

    public List<CanoeRental> getCanoeRentals() {
        return canoeRentals;
    }

    public static void main(String[] args) {
        CanoeRental canoe1 = new CanoeRental("boat1", CanoeType.BLUE, LocalDateTime.of(2021,3,11,15,0));        //T4 -b1
        CanoeRental canoe2 = new CanoeRental("boat2", CanoeType.RED, LocalDateTime.of(2021,3,10,12,0));         //T3 -b2
        CanoeRental canoe3 = new CanoeRental("boat3", CanoeType.BLUE, LocalDateTime.of(2021,3,10,10,0));        //T2 -b3
        CanoeRental canoe4 = new CanoeRental("boat4", CanoeType.BLUE, LocalDateTime.of(2021,3,10,20,0));
        CanoeRental canoe5 = new CanoeRental("boat5", CanoeType.GREEN, LocalDateTime.of(2021,2,1,10,0));        //T1 -b5

        CanoeOffice access = new CanoeOffice();

        access.addRental(canoe1);
        access.addRental(canoe2);
        access.addRental(canoe3);
        access.addRental(canoe4);
        access.addRental(canoe5);

        access.closeRentalByName("boat1", LocalDateTime.of(2021,3,11,17,0));
        access.closeRentalByName("boat2", LocalDateTime.of(2021,3,10,13,0));
        access.closeRentalByName("boat3", LocalDateTime.of(2021,3,10,12,0));
        access.closeRentalByName("boat5", LocalDateTime.of(2021,2,2,12,0));

        System.out.println(access.getRentalPriceByName("boat4", LocalDateTime.of(2021,3,10,21,1)));

        for (CanoeRental e: access.listClosedRentals()) {
            System.out.println(e.getName());
        }

        System.out.println(access.countRentals());
    }
}