package week09d03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {

    private String name;
    private int age;

    private Present gift;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPresent() {
        List<Present> presentList = new ArrayList<>(List.of(Present.values()));
        if ( age > 14 ) {
            this.gift = presentList.get(new Random().nextInt(3));
        }
        else {
            this.gift = presentList.get(new Random().nextInt(4));
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getGift() {
        return gift;
    }

}
