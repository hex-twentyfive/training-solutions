package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/*  Adott egy fájl a következő címen:
    https://raw.githubusercontent.com/TheMLGuy/Game-of-Thrones-Dataset/master/battles.csv
    Melyik ház vett részt a legtöbb csatában?
*/

public class GameOfThronesBattles {


    public String calculateTheMostActiveHouse(Path filePath) {
        List<String> housesInBattles = new ArrayList<>();
        try (BufferedReader bufferedReader = Files.newBufferedReader(filePath)) {
            String line;
            String header = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                housesInBattles.add(readTheLines(line));
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
        return countTheHouses(housesInBattles);
    }

    private String readTheLines(String line) throws IOException {
        String[] splitLine = line.split(",");
        for (int i = 5; i < 12; i++) {
            if (!splitLine[i].isBlank()) {
                return splitLine[i];
            }
        }
        return null;
    }

    private String countTheHouses(List<String> housesInBattle) {
        Map<String, Integer> houses = new HashMap<>();
        for (String house : housesInBattle) {
            if (!houses.containsKey(house)) {
                houses.put(house, 1);
            } else {
                houses.put(house, houses.get(house) + 1);
            }
        }
        //System.out.println(houses);
        return calculateTheMaximumValue(houses);
    }

    private String calculateTheMaximumValue(Map<String, Integer> houses) {
        int numberOfBattles = 0;
        String houseWithMaximumBattle = null;
        for (Map.Entry<String, Integer> entry : houses.entrySet()) {
            if (entry.getValue() > numberOfBattles) {
                numberOfBattles = entry.getValue();
                houseWithMaximumBattle = entry.getKey();
            }
        }
        return houseWithMaximumBattle;
    }


    public static void main(String[] args) {
        GameOfThronesBattles access = new GameOfThronesBattles();
        Path filePath = Path.of("src/main/resources/battles.csv");

        System.out.println(access.calculateTheMostActiveHouse(filePath));
    }

}