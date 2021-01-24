package ioreaderclasspath.countries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries = new ArrayList<>();

    private String fileLocation = "/ioreaderclasspath/country.txt";

    public void countryFileReader(String fileLocation) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                CountryStatistics.class.getResourceAsStream(fileLocation)))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] splitLine = line.split(" ");
                countries.add(new Country(splitLine[0], Integer.parseInt(splitLine[1])));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

    public int scannedCountryCounter(List<Country> countries) {
        return countries.size();
    }

    public String countryWithMaximumBorder() {
        String topBorderedCountry = null;
        int maximumNumberOfBorders = 0;
        for (int i=0; i < countries.size(); i++ ) {
            if (countries.get(i).getNumberOfBorderCountries() > maximumNumberOfBorders) {
                maximumNumberOfBorders = countries.get(i).getNumberOfBorderCountries();
                topBorderedCountry = countries.get(i).getCountryName();
            }
        }
        return topBorderedCountry;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public String getFileLocation() {
        return fileLocation;
    }

}
