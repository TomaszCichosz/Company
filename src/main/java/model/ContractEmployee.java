package model;

import java.util.UUID;

public class ContractEmployee extends Employee {

    private double contractCost;

    private ContractEmployee() {
    }

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

    public static class Builder {

        private double contractCost;
        private String name;
        private String surname;
        private String id;
        private UUID uuid;

        public Builder contractCost(double contractCost) {
            this.contractCost = contractCost;
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

        public ContractEmployee build() {
            ContractEmployee contractEmployee = new ContractEmployee();
            contractEmployee.setName(name);
            contractEmployee.setSurname(surname);
            contractEmployee.setId(id);
            contractEmployee.setUuid(uuid);
            contractEmployee.setContractCost(contractCost);
            return contractEmployee;
        }
    }
}
