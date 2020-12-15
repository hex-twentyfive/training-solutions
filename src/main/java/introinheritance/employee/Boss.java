package introinheritance.employee;

public class Boss extends Employee {

    private static final double LEADERSHIP_FACTOR = 0.1;
    private int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getSalary() {             //a Boss esetében az alapfizetéshez hozzáadódik a vezetői pótlék (beosztottak száma * LEADERSHIP_FACTOR * alapfizetés)
        double managementSupplement = numberOfEmployees * LEADERSHIP_FACTOR * super.getSalary();
        return super.getSalary() + managementSupplement;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

}
