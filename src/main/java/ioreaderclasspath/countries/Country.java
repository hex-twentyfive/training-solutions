package ioreaderclasspath.countries;

public class Country {

    private String countryName;

    private int numberOfBorderCountries;

    public Country(String countryName, int numberOfBorderCountries) {
        this.countryName = countryName;
        this.numberOfBorderCountries = numberOfBorderCountries;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getNumberOfBorderCountries() {
        return numberOfBorderCountries;
    }

}
