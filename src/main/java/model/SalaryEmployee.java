package model;

public class SalaryEmployee extends Employee {

    private double monthlySalary;

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
}
