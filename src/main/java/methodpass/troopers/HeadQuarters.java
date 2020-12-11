package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarters {

    private List<Trooper> troopers = new ArrayList<>();


    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("Adding an empty trooper is not allowed!");
        }
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        findTrooperByName(name).changePosition(target);
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Entering an empty target is not allowed!");
        }
        findClosestTrooper(target).changePosition(target);
    }

    public Trooper findTrooperByName(String name) {
        for (Trooper element: troopers) {
            if (element.getName().equals(name)) {
                return element;
            }
        }
        return null;
    }

    public Trooper findClosestTrooper(Position target) {
        Trooper closestTrooper = troopers.get(0);
        for (Trooper element: troopers) {
            if (element.distanceFrom(target) < closestTrooper.distanceFrom(target)) {
                closestTrooper = element;
            }
        }
        return closestTrooper;
    }

    public void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }
}
