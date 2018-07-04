package model;

public class ContractEmployee extends Employee{

    private double contractCost;

    public double calculatePaycheck() {
        return contractCost;
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
