package week13d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

/*  rj egy a TemplateMerger osztályba egy public String merge(Path file, List<Employee> employees) metódust,
    ami felolvassa a fájlt, melynek tartalma:

    Az alkalmazott neve: {nev}, születési éve: {ev}

    Nyugodtan beolvashatod egy utasítással!

    Majd a visszatérési értékként add vissza soronként az alkalmazottakat, abban a formátumban,
    mint ahogy a fájlban van, azaz:

    Az alkalmazott neve: John Doe, születési éve: 1980
    Az alkalmazott neve: Jack Doe, születési éve: 1990

        (Persze ehhez kell egy Employee osztály is a megfelelő attribútumokkal. ('name', 'yearOfBirth')
*/


    public String merge(Path file, List<Employe> employees) {
        StringBuilder sb = new StringBuilder();
        try {
            String line = Files.readString(file);
            for (Employe element: employees) {
                String replacedLine = line.replace("{nev}", element.getName());
                replacedLine = replacedLine.replace("{ev}", String.valueOf(element.getYearOfBirth()));
                sb.append(replacedLine).append("\n");       // fluent api --> más néven láncolás   // a  return.this  segítségével.
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Path fileLocation = Path.of("src/main/resources/employeeTemplate.txt");
        List<Employe> employees = new ArrayList<>(List.of(
                new Employe("John Doe", 1980),
                new Employe("Jack Doe", 1990)
        ));

        System.out.println(new TemplateMerger().merge(fileLocation, employees));
    }

}