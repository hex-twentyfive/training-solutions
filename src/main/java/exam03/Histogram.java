package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        StringBuilder sb = new StringBuilder();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(lineConvertToStars(line));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
        return sb.toString();
    }

    private String lineConvertToStars(String line) {
        try {
            return "*".repeat(Integer.parseInt(line)) + "\n";
        }
        catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("The lines can contain only numbers! --> " + line, iae);
        }
    }

}