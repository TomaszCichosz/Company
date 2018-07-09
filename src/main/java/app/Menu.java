package app;

public class Menu {

    public static void start() {

        final int CREATE_EMPLOYEE = 1;
        final int REMOVE_EMPLOYEE = 2;
        final int EDIT_DATA = 3;
        final int PAYMENT_RAPPORT = 4;
        final int EXIT_OPTION = 0;

        final String info = "Create employee: 1\nRemove employee: 2\nEdit employee data: 3\nPayment rapport: 4\nExit: 0";

        boolean exit = false;
        int decision;

        while (!exit) {
            System.out.println(info);
            decision = InputOutputMethods.getIntInput();
            switch (decision) {
                case CREATE_EMPLOYEE:
                    EmployeeCreationMenu.start();
                    break;
                case REMOVE_EMPLOYEE:
                    Company.getInstance().employeeList();
                    System.out.println("Choose employee to remove:");
                    Company.getInstance().removeEmployee(InputOutputMethods.getIntInput());
                    break;
                case EDIT_DATA:
                    Company.getInstance().employeeList();
                    System.out.println("Choose employee to edit:");
                    Company.getInstance().editData(InputOutputMethods.getIntInput());
                    break;
                case PAYMENT_RAPPORT:
                    Company.getInstance().paymentRapport();
                    break;
                case EXIT_OPTION:
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        }
    }
}
