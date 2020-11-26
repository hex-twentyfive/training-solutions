package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

/*    A Capsules osztály egy ArrayList attribútumban tárolja a betett kapszulákat, méghozzá a színüket String-ként.
    A Capsules osztálynak legyen egy addLast(String), addFirst(String), removeFirst(), removeLast() metódusa, mely betesz, illetve kivesz kapszulákat a csőből.
    Legyen egy List<String> getColors() metódusa, mely visszaadja a kapszulákat tartalmazó listát, hogy ki lehessen írni.
    Írj egy main() metódust, mely teszteli a metódusok működését.*/

    private List<String> capsulesList = new ArrayList<>();

    public void addLast(String coloredCapsule) {

        capsulesList.add(coloredCapsule);
    }

    public void addFirst(String coloredCapsule) {

        capsulesList.add(0, coloredCapsule);
    }

    public void removeFirst() {

        capsulesList.remove(0);
    }

    public void removeLast() {

        int capsuleListSize = capsulesList.size();

        capsulesList.remove(capsuleListSize - 1);
    }

    public List<String> getColors() {

        return capsulesList;
    }


    public static void main(String[] args) {

        String blackCapsule = "Fekete";
        String whiteCapsule = "Fehér";
        String blueCapsule = "Kék";
        String greenCapsule = "Zöld";
        String yellowCapsule = "Sárga";

        Capsules instCapsules = new Capsules();

        System.out.println("\n A műanyag cső üres  --> " + instCapsules.getColors());

        instCapsules.addFirst(yellowCapsule);
        instCapsules.addFirst(greenCapsule);
        instCapsules.addFirst(blueCapsule);
        instCapsules.addFirst(whiteCapsule);
        instCapsules.addFirst(blackCapsule);

        System.out.println("\n A műanyag csőbe helyezünk kapszulákat az öt szín mindegyikéből (addFirst()) --> " + instCapsules.getColors());

        instCapsules.addLast(blackCapsule);

        System.out.println("\n Hozzá adunk utolsó elemként egy fekett kapszulát (addLast()) --> " + instCapsules.getColors());

        instCapsules.removeFirst();

        System.out.println("\n Eltávolítjuk az első kapszulát (removeFirst()) --> " + instCapsules.getColors());

        instCapsules.removeLast();

        System.out.println("\n Eltávolítjuk az utolsó kapszulát (removeLast()) --> " + instCapsules.getColors());

        System.out.println("\n A kapszulák végső állapota  -->  " + instCapsules.getColors());

    }
}

