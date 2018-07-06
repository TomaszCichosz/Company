package app;

import model.Employee;
import strategy.ContractEmployeeStrategy;
import strategy.HourlyEmployeeStrategy;
import strategy.SalaryEmployeeStrategy;
import strategy.Strategy;

import java.util.Scanner;

public class CompanyApp {

    public static void main(String[] args) {
        /*HourlyEmployee hourlyEmployee = new HourlyEmployee.Builder().uuid().name("Jan").name("Kowalski").id("12345").hoursWorked(100).hourlyCost(20).build();
        System.out.println(hourlyEmployee.getUuid());
        System.out.println(hourlyEmployee.calculatePaycheck());
        System.out.println(hourlyEmployee);*/

        Strategy strategy;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("1. Zbuduj SalaryEmployee");
        System.out.println("2. Zbuduj ContractEmployee");
        System.out.println("3. Zbuduj HourlyEmployee");

        switch (input) {
            case 1:
                strategy = new SalaryEmployeeStrategy();
                break;
            case 2:
                strategy = new ContractEmployeeStrategy();
                break;
            case 3:
                strategy = new HourlyEmployeeStrategy();
                break;
            default:
                strategy = null;
        }

        Employee employee = strategy.buildEmployee();
    }
}