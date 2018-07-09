package app;

import strategy.ContractEmployeeStrategy;
import strategy.HourlyEmployeeStrategy;
import strategy.SalaryEmployeeStrategy;
import strategy.Strategy;

public class EmployeeCreationMenu {

    public static void start() {

        final int CREATE_SALARY_EMPLOYEE = 1;
        final int CREATE_CONTRACT_EMPLOYEE = 2;
        final int CREATE_HOURLY_EMPLOYEE = 3;
        final int EXIT_OPTION = 0;

        final String info = "Build:\nsalary employee: 1\ncontract employee: 2\nhourly employee: 3\nExit: 0";

        Strategy strategy;

        boolean exit = false;
        int decision;

        while (!exit) {
            System.out.println(info);
            decision = InputOutputMethods.getIntInput();
            switch (decision) {
                case CREATE_SALARY_EMPLOYEE:
                    strategy = new SalaryEmployeeStrategy();
                    Company.getInstance().addEmployee(strategy.buildEmployee());
                    break;
                case CREATE_CONTRACT_EMPLOYEE:
                    strategy = new ContractEmployeeStrategy();
                    Company.getInstance().addEmployee(strategy.buildEmployee());
                    break;
                case CREATE_HOURLY_EMPLOYEE:
                    strategy = new HourlyEmployeeStrategy();
                    Company.getInstance().addEmployee(strategy.buildEmployee());
                    break;
                case EXIT_OPTION:
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        }
    }
}
