package week03;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public String toString() {
        return name + ", " + bonus + " Ft";
    }



    public static void main(String[] args) {
        List<Position> lista = new ArrayList<>();
        Position p1 = new Position("Lakatos Frodó", 112_345);
        Position p2 = new Position("Oláh Legolasz", 223_456);
        Position p3 = new Position("Kádas Smaug", 334_567);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for (Position p : lista) {
            if (p.getBonus() > 150000) {
                System.out.println(p.toString());
            }
        }


    }
}
