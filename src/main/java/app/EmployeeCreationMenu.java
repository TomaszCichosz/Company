package app;

import strategy.ContractEmployeeStrategy;
import strategy.HourlyEmployeeStrategy;
import strategy.SalaryEmployeeStrategy;
import strategy.Strategy;

import java.util.Scanner;

public class EmployeeCreationMenu {

    public static void start() {

        final int CREATE_EMPLOYEE = 1;
        final int REMOVE_EMPLOYEE = 2;
        final int EDIT_DATA = 3;
        final int PAYMENT_RAPPORT = 4;
        final int EXIT_OPTION = 0;

        final String info = "Build:\n salary employee: 1\ncontract employee: 2\nhourly employee: 3\nExit: 0";

        Strategy strategy;

        boolean exit = false;
        int decision;

        while (!exit) {
            System.out.println(info);
            decision = InputOutputMethods.getIntInput();
            switch (decision) {
                case 1:
                    strategy = new SalaryEmployeeStrategy();
                    Company.getInstance().addEmployee(strategy.buildEmployee());
                    break;
                case 2:
                    strategy = new ContractEmployeeStrategy();
                    Company.getInstance().addEmployee(strategy.buildEmployee());
                    break;
                case 3:
                    strategy = new HourlyEmployeeStrategy();
                    Company.getInstance().addEmployee(strategy.buildEmployee());
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        }
    }
}
