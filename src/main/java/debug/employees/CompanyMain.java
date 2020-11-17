package debug.employees;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee dolgozo1 = new Employee("Lakatos Frodó", 1980);
        Employee dolgozo2 = new Employee("Orsós Szarumán", 1985);
        Employee dolgozo3 = new Employee("Oláh Legolasz", 1969);
        Employee dolgozo4 = new Employee("Kádas Smaug", 911);



        Company company = new Company(employees);

        company.addEmployee(dolgozo1);
        company.addEmployee(dolgozo2);
        company.addEmployee(dolgozo3);
        company.addEmployee(dolgozo4);

        System.out.println(company.listEmployeeNames());

        Employee benneVanAListaban = company.findEmployeeByName("Kádas Smaug");
        System.out.println(benneVanAListaban.getName());

    }
}

