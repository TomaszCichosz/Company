package strategy;

import model.Employee;
import model.SalaryEmployee;

import java.util.Scanner;

public class SalaryEmployeeStrategy implements Strategy {

    @Override
    public Employee buildEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String surname = scanner.nextLine();
        System.out.println("Podaj id:");
        String id = scanner.nextLine();
        System.out.println("Podaj salary");
        double salary = scanner.nextInt();

        return new SalaryEmployee.Builder().uuid().name(name).surname(surname)
                .id(id).monthlySalary(salary).build();
    }
}
