package intromethods;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee instEmploye = new Employee("Lakatos Frodó",1981, 144_000);

        System.out.println(instEmploye);
        instEmploye.setName("Kádas Smaug");
        System.out.println("Changeing name: " + instEmploye);

        instEmploye.raiseSalary(10250);
        System.out.println("Rising: " + instEmploye);
    }

}
