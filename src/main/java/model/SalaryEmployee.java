package model;

import java.util.UUID;

public class SalaryEmployee extends Employee {

    private double monthlySalary;

    private SalaryEmployee() {
    }

    public double calculatePaycheck() {
        return monthlySalary * 0.77d;
    }

    public void editData() {

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
        private String id;
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

        public Builder id(String id) {
            this.id = id;
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
            salaryEmployee.setId(id);
            salaryEmployee.setUuid(uuid);
            salaryEmployee.setMonthlySalary(monthlySalary);
            return salaryEmployee;
        }
    }
}
