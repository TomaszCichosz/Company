import model.ContractEmployee;
import model.HourlyEmployee;
import model.SalaryEmployee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void givenBuilder_whenConstructingSalaryEmployee_thenSalaryEmployeeConstructedCorrectly() {
        SalaryEmployee salaryEmployee = new SalaryEmployee.Builder().name("Jan").surname("Kowalski").id("jan_kowalski").monthlySalary(1000d).build();

        assertEquals("Jan", salaryEmployee.getName());
        assertEquals("Kowalski", salaryEmployee.getSurname());
        assertEquals("jan_kowalski", salaryEmployee.getId());
        assertEquals(1000d, salaryEmployee.getMonthlySalary(), 0.0001d);
    }

    @Test
    public void givenBuilder_whenConstructingContractEmployee_thenContractEmployeeConstructedCorrectly() {
        ContractEmployee contractEmployee = new ContractEmployee.Builder().name("Jan").surname("Kowalski").id("jan_kowalski").contractCost(100d).build();

        assertEquals("Jan", contractEmployee.getName());
        assertEquals("Kowalski", contractEmployee.getSurname());
        assertEquals("jan_kowalski", contractEmployee.getId());
        assertEquals(100d, contractEmployee.getContractCost(), 0.0001d);
    }

    @Test
    public void givenBuilder_whenConstructingHourlyEmployee_thenHourlyEmployeeConstructedCorrectly() {
        HourlyEmployee hourlyEmployee = new HourlyEmployee.Builder().name("Jan").surname("Kowalski").id("jan_kowalski").hourlyCost(10d).hoursWorked(100).build();

        assertEquals("Jan", hourlyEmployee.getName());
        assertEquals("Kowalski", hourlyEmployee.getSurname());
        assertEquals("jan_kowalski", hourlyEmployee.getId());
        assertEquals(10d, hourlyEmployee.getHourlyCost(), 0.0001d);
        assertEquals(100, hourlyEmployee.getHoursWorked());
    }

    @Test
    public void givenHourlyEmployee_whenCalculatePaycheck_thenPaycheckValueCalculatedCorrectly() {
        HourlyEmployee hourlyEmployee = new HourlyEmployee.Builder().hourlyCost(2d).hoursWorked(100).build();

        double paycheck = hourlyEmployee.calculatePaycheck();

        assertEquals(200d, paycheck, 0.0001d);
    }

    @Test
    public void givenContractEmployee_whenCalculatePaycheck_thenPaycheckValueCalculatedCorrectly() {
        ContractEmployee contractEmployee = new ContractEmployee.Builder().contractCost(100).build();

        double paycheck = contractEmployee.calculatePaycheck();

        assertEquals(85d, paycheck, 0.0001d);
    }

    @Test
    public void givenSalaryEmployee_whenCalculatePaycheck_thenPaycheckValueCalculatedCorrectly() {
        SalaryEmployee salaryEmployee = new SalaryEmployee.Builder().monthlySalary(1000).build();

        double paycheck = salaryEmployee.calculatePaycheck();

        assertEquals(770d, paycheck, 0.0001d);
    }
}
