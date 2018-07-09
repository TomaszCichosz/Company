package model;

import app.InputOutputMethods;

import java.util.UUID;

public class SalaryEmployee extends Employee {

    private double monthlySalary;

    private SalaryEmployee() {
    }

    public double calculatePaycheck() {
        return monthlySalary * 0.77d;
    }

    public void editData() {
        System.out.println("Name: " + getName());
        System.out.println("New name:");
        setName(InputOutputMethods.getStringInput());
        System.out.println("Surname: " + getSurname());
        System.out.println("New surname:");
        setSurname((InputOutputMethods.getStringInput()));
        System.out.println("Monthly salary: " + getMonthlySalary());
        System.out.println("New monthly salary:");
        setMonthlySalary(InputOutputMethods.getDoubleInput());
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public static class Builder {

        private double monthlySalary;
        private String name;
        private String surname;
        private UUID uuid;

        public Builder monthlySalary(double monthlySalary) {
            this.monthlySalary = monthlySalary;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder uuid() {
            this.uuid = UUID.randomUUID();
            return this;
        }

        public SalaryEmployee build() {
            SalaryEmployee salaryEmployee = new SalaryEmployee();
            salaryEmployee.setName(name);
            salaryEmployee.setSurname(surname);
            salaryEmployee.setUuid(uuid);
            salaryEmployee.setMonthlySalary(monthlySalary);
            return salaryEmployee;
        }
    }
}
