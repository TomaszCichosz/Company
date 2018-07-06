package strategy;

import model.ContractEmployee;
import model.Employee;

import java.util.Scanner;

public class ContractEmployeeStrategy implements Strategy {

    @Override
    public Employee buildEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String surname = scanner.nextLine();
        System.out.println("Podaj id:");
        String id = scanner.nextLine();
        System.out.println("Podaj contractCost");
        double contractCost = scanner.nextInt();

        return new ContractEmployee.Builder().uuid().name(name).surname(surname)
                .id(id).contractCost(contractCost).build();
    }
}
