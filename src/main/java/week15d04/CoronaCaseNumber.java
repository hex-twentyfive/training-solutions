package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/*  Letölthetőek a koronavírus adatok innen:
    https://opendata.ecdc.europa.eu/covid19/casedistribution/csv/data.csv
    Melyik három héten volt Magyarországon a legtöbb esetszám?
*/

public class CoronaCaseNumber {

    private List<CaseNumberBasedOnWeeks> caseNumbers = new ArrayList<>();

    public List<CaseNumberBasedOnWeeks> readFromFile(Path filePath, String country) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(filePath)) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                splitTheLines(line, country);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
        return determinesTheThreeHighestValues(caseNumbers);
    }

    private void splitTheLines(String line, String country) {
        String[] splitLines = line.split(",");
        if (country.equals(splitLines[4])) {
            caseNumbers.add(new CaseNumberBasedOnWeeks(splitLines[1], Integer.parseInt(splitLines[2])));
        }
    }

    private List<CaseNumberBasedOnWeeks> determinesTheThreeHighestValues(List<CaseNumberBasedOnWeeks> inputList) {
        List<CaseNumberBasedOnWeeks> sortedList = new ArrayList<>(caseNumbers);
        Collections.sort(sortedList, new Comparator<CaseNumberBasedOnWeeks>() {
            @Override
            public int compare(CaseNumberBasedOnWeeks o1, CaseNumberBasedOnWeeks o2) {
                return o2.getCaseNumbers()-(o1.getCaseNumbers());
            }
        });
        List<CaseNumberBasedOnWeeks> threeHighestValue = new ArrayList<>(List. of(
                sortedList.get(0), sortedList.get(1), sortedList.get(2)));
        return threeHighestValue;
    }


    public static void main(String[] args) {
        CoronaCaseNumber access = new CoronaCaseNumber();
        Path filePath = Path.of("src/main/resources/coronavirusGlobalData.csv");
        String country = "Hungary";

        System.out.println(access.readFromFile(filePath, country).toString());

    }

}