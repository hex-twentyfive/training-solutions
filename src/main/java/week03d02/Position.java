package week03d02;

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

    @Override
    public String toString() {
        return "Az alkalmazott neve: " + name + ", --> Az alkalmazott éves bónusza: " + bonus;
    }

    public static void main(String[] args) {

        List<Position> employeesBonuses = new ArrayList<>();

        employeesBonuses.add(new Position("Lakatos Legolas", 250_000));
        employeesBonuses.add(new Position("Kádas Smaug", 155_000));
        employeesBonuses.add(new Position("Kocsis Sarumán", 150_000));
        employeesBonuses.add(new Position("Keszthely Frodo", 15_000));

        System.out.println("A 150.000 egységet meghaladó bónusszal rendelkező alakalmazottak:");
        for (Position element: employeesBonuses) {
            if (element.bonus > 150_000) {
                System.out.println(element.toString());
            }
        }

    }

}
