package debug.employees;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees = new ArrayList<>();

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee newWorker) {
        employees.add(newWorker);
    }

    public Employee findEmployeeByName(String inputName) {
        for (Employee elements: employees) {
            if (elements.getName().equals(inputName)) {
                return elements;
            }
        }
        return null;
    }

    public List<String> listEmployeeNames() {
        List<String> workerNames = new ArrayList<>();
        for (Employee elements: employees) {
            workerNames.add(elements.getName());
        }
        return workerNames;
    }
}
