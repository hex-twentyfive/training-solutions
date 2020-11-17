package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> capsules = new ArrayList<>();

    public void addLast(String colour) {
        capsules.add(colour);
    }

    public void addFirst(String colour){
        capsules.add(0, colour);
    }

    public void removeFirst() {
        capsules.remove(0);
    }

    public void removeLast() {
        capsules.remove(capsules.size()-1);
    }

    public List<String> getColors() {
        return capsules;
    }

    public static void main(String[] args) {

        Capsules c = new Capsules();
        c.addFirst("fehér");
        c.addLast("szürke");
        c.addFirst("cián");
        c.addLast("magenta");
        c.addFirst("sárga");
        c.addLast("fekete");

        System.out.println(c.getColors());

        c.removeFirst();
        System.out.println(c.getColors());

        c.removeLast();
        System.out.println(c.getColors());

    }
}

