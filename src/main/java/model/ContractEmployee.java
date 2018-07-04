package model;

public class ContractEmployee extends Employee{

    private double contractCost;

    public double calculatePaycheck() {
        return 0;
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
