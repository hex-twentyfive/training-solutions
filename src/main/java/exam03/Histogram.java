package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        StringBuilder sb = new StringBuilder();
        try {
            String line;
            while ((line = reader.readLine()) != null) {

                sb.append(createStarFromLine(line));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
        return sb.toString();
    }

    private String createStarFromLine(String line) {
        StringBuilder sb = new StringBuilder();
        try {
            int numberFromLine = Integer.parseInt(line);
            for (int i = 0; i < numberFromLine; i++) {
                sb.append("*");
            }
            sb.append("\n");
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("The line can only contain number! --> " + line);
        }
        return sb.toString();
    }

}