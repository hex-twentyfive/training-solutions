package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owlsByCounty = new HashMap<>();

    public void readFromFile(BufferedReader reader) {
        try {
            String line;
            while((line = reader.readLine()) != null) {
                splitTheLinesAndFillTheMap(line);
            } }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

    private void splitTheLinesAndFillTheMap(String line) {
        String[] split = line.split("=");
        owlsByCounty.put(split[0], Integer.parseInt(split[1]));
    }

    public int getNumberOfOwls(String county) {
        if (owlsByCounty.containsKey(county)) {
            return owlsByCounty.get(county);
        } else {
            throw new IllegalArgumentException("Wrong parameter --> " + county);
        }
    }

}