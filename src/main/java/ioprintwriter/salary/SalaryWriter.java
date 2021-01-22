package ioprintwriter.salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SalaryWriter {

    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path file) {
        try (PrintWriter printWriter = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String name : names) {
                int salary = 0;
                if (name.contains("Dr")) {
                    salary = 500_000;
                } else if (name.contains("Mr") || name.contains("Mrs")) {
                    salary = 200_000;
                } else {
                    salary = 100_000;
                }
                printWriter.print(name);
                printWriter.print(", ");
                printWriter.println(salary);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write the file!", ioe);
        }
    }

    public List<String> getNames() {
        return names;
    }

}
