package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant instRestaurant = new Restaurant("MinerInn", 10);
        List<String> menu = new ArrayList<>();

        menu.add("Cooked Chicken with Chorus Fruit");
        menu.add("Cooked Porkchop with Dried Kelp");
        menu.add("Mushroom Stew with Melon Slice");
        menu.add("Mushroom Stew with Melon Slice");
        menu.add("Pufferfish with Poisonous Potato");
        instRestaurant.setMenu(menu);

        System.out.println("Host name: " + instRestaurant.getName());
        System.out.println("Host capacity: " + instRestaurant.getCapacity());
        System.out.println("Host Menu: " + instRestaurant.getMenu());

    }
}