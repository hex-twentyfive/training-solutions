package introdate;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee transEmploye = new Employee(1980,11,19, "Lakatos Frodo");

        System.out.println("Employee's name: " + transEmploye.getName());
        System.out.println("Employee's date of birth: " + transEmploye.getDateOfBirth());
        System.out.println("Date of employment: " + transEmploye.getBeginEmployment());

    }
}
