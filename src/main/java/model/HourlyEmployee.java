package model;

public class HourlyEmployee extends Employee {

    private int hoursWorked;
    private double hourlyCost;

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
}
