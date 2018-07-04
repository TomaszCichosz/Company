package model;

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
        private String id;
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

        public Builder id(String id) {
            this.id = id;
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
            hourlyEmployee.setId(id);
            hourlyEmployee.setUuid(uuid);
            hourlyEmployee.setHourlyCost(hourlyCost);
            hourlyEmployee.setHoursWorked(hoursWorked);
            return hourlyEmployee;
        }
    }
}
