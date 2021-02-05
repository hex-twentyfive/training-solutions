package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeacherWorkingHours {

/*  A fájl tantárgyfelosztást tartalmaz. A tanttárgyfelosztást 4-es blokkokban adjuk meg. Első sor a tanár neve,
    majd a tantárgy, majd az osztály ahol tanítja és végül az, hogy heti hány órában.
    Írj egy metódust, ami paraméterül várja egy tanár nevét, és kiírja, hogy hány órája van egy héten.
    A fájl megtalálható a examples\week13d03\src\main\resources\beosztas.txt
 */


    public int returnTheWorkingHoursFromFile(String fileLocation, String teacherName) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fileLocation)))) {
            return readTheFileAndCountTheWorkingHours(bufferedReader, teacherName);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

    private int readTheFileAndCountTheWorkingHours(BufferedReader bufferedReader, String teacherName) throws IOException {
        int workHourCounter = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (teacherName.equals(line)) {
                technicalSkipTwoReadRow(bufferedReader);
                workHourCounter += Integer.parseInt(bufferedReader.readLine());
            }
        }
        return workHourCounter;
    }

    private void technicalSkipTwoReadRow(BufferedReader bufferedReader) throws IOException{
        bufferedReader.readLine();
        bufferedReader.readLine();
    }


    public static void main(String[] args) {
        String fileLocation = "/beosztas.txt";
        String testTeacherName = "Csincsilla Csilla";
        TeacherWorkingHours access = new TeacherWorkingHours();

        System.out.println(access.returnTheWorkingHoursFromFile(fileLocation, testTeacherName));
    }

}