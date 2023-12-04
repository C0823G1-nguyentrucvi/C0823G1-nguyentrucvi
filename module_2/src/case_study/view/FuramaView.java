package case_study.view;

import case_study.common.DateHandler;
import case_study.common.ExceptionHandler;
import case_study.common.RegexHandler;
import case_study.controller.FuramaController;
import case_study.model.Customer;
import case_study.model.Employee;


import java.util.List;
import java.util.Scanner;

public class FuramaView {
    private final FuramaController furamaController = new FuramaController();
    private final Scanner scanner = new Scanner(System.in);

    public void renderView() {
        System.out.println("Welcome to FURAMA!!");
        showMainMenu();
    }

    private void showMainMenu() {
        while (true) {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "0. Exit\n");
            System.out.print("Your choice: ");
            int choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 2:
                    showCustomerMenu();
                    break;
                case 1:
                    showEmployeeMenu();
                    break;
                case 3:
                    showFacilityMenu();
                    break;
                case 4:
                    showBookingMenu();
                    break;
                case 5:
                    showPromotionMenu();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choice again");
                    break;
            }
        }
    }

    private void showPromotionMenu() {
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
        int choice = ExceptionHandler.checkParseInteger();
        switch (choice) {
            case 1:
            case 2:
            case 3:
                break;
        }
    }

    private void showBookingMenu() {
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new contracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
        int choice = ExceptionHandler.checkParseInteger();
        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break;
        }

    }

    private void showFacilityMenu() {
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tDelete facility\n" +
                "5\tReturn main menu\n");
        int choice = ExceptionHandler.checkParseInteger();
        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                break;
        }
    }

    private void showEmployeeMenu() {
        System.out.println("1 Display list employees\n" +
                "2 Add new employee\n" +
                "3 Edit employee\n" +
                "4 Delete employee\n" +
                "5 Search by name employee\n" +
                "6 Return main menu\n");
        int choice = ExceptionHandler.checkParseInteger();
        switch (choice) {
            case 1:
                List<Employee> employees = this.furamaController.findAll();
                this.displayEmployees(employees);
                break;
            case 2:
                addNewEmployee();
                break;
            case 3:
                editEmployee();
                break;
            case 4:
                deleteEmployee();
                break;
            case 5:
                searchEmployee();
                break;
            case 6:
                break;
        }
    }

    private void addNewEmployee() {
        System.out.print("Enter code: ");
        String code = RegexHandler.checkRegexEmployeeCode();
        System.out.print("Enter name: ");
        String name = RegexHandler.checkRegexName();
        System.out.print("Enter date: ");
        String date = DateHandler.is18YearOld();
        System.out.print("Enter identity: ");
        Integer identity = ExceptionHandler.checkParseInteger();
        System.out.print("Enter phone number: ");
        String phoneNumber = RegexHandler.checkPhoneNumber();
        System.out.print("Enter gmail: ");
        String gmail = scanner.nextLine();
        System.out.print("Enter level: ");
        String level = scanner.nextLine();
        System.out.print("Enter position: ");
        String position = scanner.nextLine();
        System.out.print("Enter money: ");
        Double money = ExceptionHandler.checkParseDouble();
        Employee employee = new Employee(code, name, date, identity, phoneNumber, gmail, level, position, money);
        this.furamaController.save(employee);
    }


    private void searchEmployee() {

    }

    private void deleteEmployee() {

    }

    private void editEmployee() {

    }

    private void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    private void showCustomerMenu() {
        while (true) {
            System.out.println("1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Delete customer\n" +
                    "5. Search by name customer\n" +
                    "6. Return main menu\n");
            System.out.print("Your choice: ");
            int choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                    List<Customer> customerList = this.furamaController.findAlls();
                    this.displayCustomer(customerList);
                    break;
                case 2:
                    addNewCustomer();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choice again");
                    break;
            }
        }
    }

    private void addNewCustomer() {
        System.out.print("Enter code: ");
        String code = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter date: ");
        String date = DateHandler.is18YearOld();
        System.out.print("Enter identity: ");
        Integer identity = ExceptionHandler.checkParseInteger();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter gmail: ");
        String gmail = scanner.nextLine();
        System.out.print("Enter customer type: ");
        String customerType = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(code, name, date, identity, phoneNumber, gmail, customerType,
                address);
        this.furamaController.saveCustomer(customer);
    }

    private void displayCustomer(List<Customer> customer) {
        for (Customer customers : customer) {
            System.out.println(customers);
        }

    }
}
