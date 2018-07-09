package model;

import app.InputOutputMethods;

import java.util.UUID;

public class HourlyEmployee extends Employee {

    private int hoursWorked;
    private double hourlyCost;

    private HourlyEmployee() {
    }

    public double calculatePaycheck() {
        return hoursWorked * hourlyCost;
    }

    public void editData() {
        System.out.println("Name: " + getName());
        System.out.println("New name:");
        setName(InputOutputMethods.getStringInput());
        System.out.println("Surname: " + getSurname());
        System.out.println("New surname:");
        setSurname((InputOutputMethods.getStringInput()));
        System.out.println("Hours cost: " + getHoursWorked());
        System.out.println("New hours worked:");
        setHoursWorked(InputOutputMethods.getIntInput());
        System.out.println("Hourly cost: " + getHourlyCost());
        System.out.println("New hourly cost:");
        setHourlyCost(InputOutputMethods.getDoubleInput());
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyCost() {
        return hourlyCost;
    }

    public void setHourlyCost(double hourlyCost) {
        this.hourlyCost = hourlyCost;
    }

    public static class Builder {

        private int hoursWorked;
        private double hourlyCost;
        private String name;
        private String surname;
        private UUID uuid;

        public Builder hoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public Builder hourlyCost(double hourlyCost) {
            this.hourlyCost = hourlyCost;
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

        public HourlyEmployee build() {
            HourlyEmployee hourlyEmployee = new HourlyEmployee();
            hourlyEmployee.setName(name);
            hourlyEmployee.setSurname(surname);
            hourlyEmployee.setUuid(uuid);
            hourlyEmployee.setHourlyCost(hourlyCost);
            hourlyEmployee.setHoursWorked(hoursWorked);
            return hourlyEmployee;
        }
    }
}
