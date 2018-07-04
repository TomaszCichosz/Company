package model;

public class ContractEmployee extends Employee {

    private double contractCost;

    public double calculatePaycheck() {
        return contractCost * 0.85d;
    }

    public void editData() {

    }

    public double getContractCost() {
        return contractCost;
    }

    public void setContractCost(double contractCost) {
        this.contractCost = contractCost;
    }
}
