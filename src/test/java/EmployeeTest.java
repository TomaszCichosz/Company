import model.ContractEmployee;
import model.HourlyEmployee;
import model.SalaryEmployee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void givenHourlyEmployee_whenCalculatePaycheckMethod_thenPaycheckValueCalculatedCorrectly() {
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.setHoursWorked(100);
        hourlyEmployee.setHourlyCost(2d);

        double paycheck = hourlyEmployee.calculatePaycheck();

        assertEquals(200d, paycheck, 0.0001d);
    }

    @Test
    public void givenContractEmployee_whenCalculatePaycheckMethod_thenPaycheckValueCalculatedCorrectly() {
        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setContractCost(100);

        double paycheck = contractEmployee.calculatePaycheck();

        assertEquals(85d, paycheck, 0.0001d);
    }

    @Test
    public void givenSalaryEmployee_whenCalculatePaycheckMethod_thenPaycheckValueCalculatedCorrectly() {
        SalaryEmployee salaryEmployee = new SalaryEmployee();
        salaryEmployee.setMonthlySalary(1000);

        double paycheck = salaryEmployee.calculatePaycheck();

        assertEquals(770d, paycheck, 0.0001d);
    }
}
