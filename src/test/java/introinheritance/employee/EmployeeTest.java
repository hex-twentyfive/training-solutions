package introinheritance.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testCreateEmploye() {
        Employee testEmployee = new Employee("Lakatos Frodó", "2314 Kukutyin, Fő út 106.", 180_000);

        assertEquals("Lakatos Frodó", testEmployee.getName());
        assertEquals("2314 Kukutyin, Fő út 106.", testEmployee.getAddress());
        assertEquals(180_000, testEmployee.getSalary());
    }

    @Test
    public void testMigrateEmployee() {
        Employee testEmployee = new Employee("Lakatos Frodó", "2314 Kukutyin, Fő út 106.", 180_000);
        testEmployee.migrate("2314 Kukutyin, Mellék út 100.");

        assertEquals("2314 Kukutyin, Mellék út 100.", testEmployee.getAddress());
    }

    @Test
    public void testRaiseSalary() {
        Employee testEmployee = new Employee("Lakatos Frodó", "2314 Kukutyin, Fő út 106.", 180_000);
        testEmployee.raiseSalary(5);

        assertEquals(189_000, testEmployee.getSalary());
    }

}