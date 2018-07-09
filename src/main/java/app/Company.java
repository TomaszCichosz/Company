package app;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees = new ArrayList<>();

    private Company() {
    }

    public static Company getInstance() {
        return CompanyHolder.INSTANCE;
    }

    private static class CompanyHolder {
        private static final Company INSTANCE = new Company();
    }

    public void paymentRapport() {
        System.out.println("Payments for " + employees.size() + " employees");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getSurname() + "\tPayment: " + employee.calculatePaycheck());
        }
    }

    public void employeeList() {
        int i = 0;
        for (Employee employee : employees) {
            System.out.println("Employee index: " + i++); //sprawdz czy dziala
            System.out.println(employee);
        }
    }

    public void removeEmployee(int employeeIndex) {
        employees.remove(employeeIndex);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}