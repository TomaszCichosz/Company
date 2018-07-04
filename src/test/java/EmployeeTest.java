import model.ContractEmployee;
import model.HourlyEmployee;
import model.SalaryEmployee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void givenHourlyEmployee_whenCalculatePaycheckMethod_thenEquals() {
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.setHoursWorked(100);
        hourlyEmployee.setHourlyCost(2d);

        double paycheck = hourlyEmployee.calculatePaycheck();

        Assert.assertEquals(200d, paycheck, 0.0001d);
    }

    @Test
    public void givenContractEmployee_whenCalculatePaycheckMethod_thenEquals() {
        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setContractCost(100);

        double paycheck = contractEmployee.calculatePaycheck();

        Assert.assertEquals(85d, paycheck, 0.0001d);
    }

    @Test
    public void givenSalaryEmployee_whenCalculatePaycheckMethod_thenEquals() {
        SalaryEmployee salaryEmployee = new SalaryEmployee();
        salaryEmployee.setMonthlySalary(1000);

        double paycheck = salaryEmployee.calculatePaycheck();

        Assert.assertEquals(770d, paycheck, 0.0001d);
    }
}
