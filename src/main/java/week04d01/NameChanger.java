package week04d01;

import java.util.IllegalFormatException;

public class NameChanger {

/*  Készítsd el a NameChanger osztályt, melynek privát attribútuma legyen a String fullName,
    mely egy ember teljes nevét reprezentálja! A fullName attribútum [vezetéknév][szóköz][keresztnév] formátumban épül fel.
    A konstruktor állítsa be a paraméterül kapott értékre az adattagot, de ha az érték null, vagy üres String,
    akkor dobjon egy IllegalAgrumentException kivételt a következő üzenettel: Invalid name:[paraméter értéke]!

    Legyen egy changeFirstName(String firstName) metódusa, mely megváltoztatja az objektum állapotát és
    kicseréli a vezetéknevet a paraméterül kapott értékre!
*/


    private String fullName;

    public NameChanger(String fullName) {
        if (fullName == null | fullName.length() == 0) {
           throw new IllegalArgumentException("Invalid name: <" + fullName + "> !");
        }
        this.fullName = fullName;
    }

    public void changeFirstName(String firstName) {
        String[] split = fullName.split(" ");
        fullName = firstName + " " + split[1];
    }

    public String getFullName() {
        return fullName;
    }

}
