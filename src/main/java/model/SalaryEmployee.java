package model;

public class SalaryEmployee extends Employee{

    private double monthlySalary;

    public double calculatePaycheck() {
        return 0;
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
