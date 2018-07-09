package strategy;

import model.Employee;
import model.HourlyEmployee;

import java.util.Scanner;

public class HourlyEmployeeStrategy implements Strategy {

    @Override
    public Employee buildEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String surname = scanner.nextLine();
        System.out.println("Podaj id:");
        String id = scanner.nextLine();
        System.out.println("Podaj hoursWorked:");
        int hoursWorked = scanner.nextInt();
        System.out.println("Podaj hourlyCost");
        double hourlyCost = scanner.nextDouble();

        return new HourlyEmployee.Builder().uuid().name(name).surname(surname)
                .id(id).hoursWorked(hoursWorked).hourlyCost(hourlyCost).build();
    }
}
