package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Diary {

    public void newMark(String name, int mark) {
        String fileLocation = "src/main/resources/school/" + name + ".txt";
        Path filePath = Path.of(fileLocation);
        try {
            if (Files.exists(filePath)) {
                Files.writeString(filePath, Integer.toString(mark) + "\n", StandardOpenOption.APPEND);
            } else {
              Files.writeString(filePath, Integer.toString(mark) + "\n");
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not find the file!", ioe);
        }
    }

    public void yearEndAverage(String name) {
        String fileLocation = "src/main/resources/school/" + name + ".txt";
        Path filePath = Path.of(fileLocation);
        String average = "Average: " + averageCalculator(filePath);
        try {
            Files.writeString(filePath,average, StandardOpenOption.APPEND);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not find the file!", ioe);
        }
    }

    private double averageCalculator(Path filePath) {
        double markSum = 0;
        int markAmount = 0;
        try {
            List<String> marks = Files.readAllLines(filePath);
            for (String mark: marks) {
                markSum += Integer.parseInt(mark);
            }
            markAmount = marks.size();
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cant not find the file!");
        }
        return markSum / markAmount;
    }


}
