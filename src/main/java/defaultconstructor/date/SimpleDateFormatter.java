package defaultconstructor.date;

public class SimpleDateFormatter {

    private CountryCode defaultCountry;
    private static final String SEPARATOR = "-";

    public SimpleDateFormatter() {
        this.defaultCountry = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate) {                       //Az osztály egyik publikus metódusa átvesz egy enumot és annak alapján állítja össze a dátum stringet
        return formatDateStringByCountryCode(defaultCountry, simpleDate);
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {           //, a másik az alapértelmezett országkódot használja.

        if (countryCode == CountryCode.HU) {
            return simpleDate.getYear() + SEPARATOR + simpleDate.getMonth() + SEPARATOR + simpleDate.getDay();
        }
        else if (countryCode == CountryCode.EN) {
            return simpleDate.getDay() + SEPARATOR + simpleDate.getMonth() + SEPARATOR + simpleDate.getYear();
        }
        else {
            return simpleDate.getMonth() + SEPARATOR + simpleDate.getDay() + SEPARATOR + simpleDate.getYear();
        }
    }

}
