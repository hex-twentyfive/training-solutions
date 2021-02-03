package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LongestTownName {

/*  A GitHubon a examples\week13d01\src\main\resources\iranyitoszamok-varosok-2021.csv fájl tartalmazza a
    magyar városok listáját. Add vissza a leghosszabb nevű várost!
*/


    private static final String FILE_LOCATION_DIRECT = "/iranyitoszamok-varosok-2021.csv";


    public String longestTownNameFinder(String fileLocation) {

        String townWithLongestName = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fileLocation)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitLine = line.split(";");
                if (splitLine.length <= 1) {
                    throw new IllegalArgumentException("Illegal line found --> " + line);
                }
                if (splitLine[1].length() > townWithLongestName.length()) {
                    townWithLongestName = splitLine[1];
                }
            }
            if (townWithLongestName.equals("")) {
                throw new IllegalArgumentException("No town found in list!");
            }
            return townWithLongestName;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

    public static void main(String[] args) {
        LongestTownName access = new LongestTownName();

        System.out.println(access.longestTownNameFinder(LongestTownName.FILE_LOCATION_DIRECT));

    }

}