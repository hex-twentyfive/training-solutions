package debug.employees;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {

        List<Employee> testWorkers = new ArrayList<>();

        Employee testWorker1 = new Employee("Lakatos Frodó", 1980);
        Employee testWorker2 = new Employee("Orsós Szarumán", 1985);
        Employee testWorker3 = new Employee("Oláh Legolasz", 1969);
        Employee testWorker4 = new Employee("Kádas Smaug", 911);

        Company instCompany = new Company(testWorkers);

        instCompany.addEmployee(testWorker1);
        instCompany.addEmployee(testWorker2);
        instCompany.addEmployee(testWorker3);
        instCompany.addEmployee(testWorker4);

        System.out.println(instCompany.listEmployeeNames());

        Employee testFind = instCompany.findEmployeeByName("Kádas Smaug");
        System.out.println(testFind.getName());


    }
}
