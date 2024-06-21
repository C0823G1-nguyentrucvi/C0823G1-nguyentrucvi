package case_study.view;

import case_study.common.DateHandler;
import case_study.common.ExceptionHandler;
import case_study.common.RegexHandler;
import case_study.controller.FuramaController;
import case_study.model.*;


import java.util.List;
import java.util.Map;
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
        while (true) {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tDelete facility\n" +
                    "5\tReturn main menu\n");
            int choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                case 2:
                    System.out.println("1.Add New Villa\n" +
                            "2.Add New House\n" +
                            "3.Add New Room\n" +
                            "4.Back to menu\n");
                    choice = ExceptionHandler.checkParseInteger();
                    switch (choice) {
                        case 1:
                            Villa villa = addNewVilla();
                            furamaController.addNewVilla(villa);
                            break;
                        case 2:
                            House house = addNewHouse();
                            furamaController.addNewHouse(house);
                            break;
                        case 3:
                            Room room = addNewRoom();
                            furamaController.addNewRoom(room);
                            break;
                        case 4:
                            return;

                    }

                    break;
                case 3:
                    Map<Facility, Integer> facilityIntegerMap = furamaController.showAll();
                    for (Facility facility : facilityIntegerMap.keySet()) {
                        System.out.println(facility + " value: " + facilityIntegerMap.get(facility));
                    }
                    break;
                case 4:
                case 5:
                    break;
            }
        }
    }

    private Room addNewRoom() {
        System.out.println("codeService");
        String codeService = RegexHandler.checkRoom();
        System.out.println("codeService");
        String nameService = RegexHandler.checkName();
        System.out.println("area");
        Double area = RegexHandler.checkArea();
        System.out.println("expense");
        float expense = ExceptionHandler.checkParseInteger();
        System.out.println("People");
        int People = ExceptionHandler.checkParseInteger();
        System.out.println("freeDV");
        String freeDV = RegexHandler.checkName();
        Room room = new Room(codeService, nameService, area, expense, People, freeDV);

        return room;
    }

    private House addNewHouse() {
        System.out.println(" codeService");
        String codeService = RegexHandler.checkHouse();
        System.out.println("  nameService");
        String nameService = RegexHandler.checkName();
        System.out.println("  area");
        Double area = RegexHandler.checkArea();
        System.out.println("  expense");
        float expense = ExceptionHandler.checkParseInteger();
        System.out.println(" People");
        int People = ExceptionHandler.checkParseInteger();
        System.out.println("  standard");
        String standard = RegexHandler.checkName();
        System.out.println(" quantity");
        int quantity = ExceptionHandler.checkParseInteger();
        House house = new House(codeService, nameService, area, expense, People, standard, quantity);


        return house;
    }

    private Villa addNewVilla() {
        System.out.println("codeService");
        String codeService = RegexHandler.checkVilla();
        System.out.println("nameService");
        String nameService = RegexHandler.checkName();
        System.out.println("area");
        Double area = RegexHandler.checkArea();
        System.out.println("expense");
        float expense = ExceptionHandler.checkParseInteger();
        System.out.println("member");
        int People = ExceptionHandler.checkParseInteger();
        System.out.println("standard");
        String standard = scanner.nextLine();
        System.out.println("numberOfFloors");
        int numberOfFloors = ExceptionHandler.checkParseInteger();
        Villa villa = new Villa(codeService, nameService, area, expense, People, standard, numberOfFloors);
        return villa;
    }

    private void showEmployeeMenu() {
        while (true) {
            System.out.println("1 Display list employees\n" +
                    "2 Add new employee\n" +
                    "3 Edit employee\n" +
                    "4 Delete employee\n" +
                    "5 Search by code employee\n" +
                    "6 Return main menu\n");
            System.out.print("Choice: ");
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
                    return;
            }
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
        System.out.print("Enter code: ");
        String code = RegexHandler.checkRegexEmployeeCode();
        Employee employeeByCode = furamaController.findByCode(code);
        System.out.println(employeeByCode);
    }

    private void deleteEmployee() {
        System.out.print("Enter code: ");
        String code = RegexHandler.checkRegexEmployeeCode();
        Employee employeeByCode = furamaController.findByCode(code);
        if (employeeByCode != null) {
            furamaController.remove(employeeByCode);
            System.out.println("done ");
        } else {
            System.out.println("no see: ");
        }
    }

    private void editEmployee() {
        System.out.print("Enter code: ");
        String code = RegexHandler.checkRegexEmployeeCode();
        Employee employee = this.furamaController.findByCode(code);
        if (employee == null) {
            System.out.println("Employee is not found!!");
        } else {
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
            employee.setName(name);
            employee.setDate(date);
            employee.setIdentity(identity);
            employee.setPhoneNumber(phoneNumber);
            employee.setGmail(gmail);
            employee.setLevel(level);
            employee.setPosition(position);
            employee.setMoney(money);
            this.furamaController.update(employee);
        }
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
                    "5. Search by code customer\n" +
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
                case 3:
                    editCustomer();
                    break;
                case 4:
                    deleteCustomer();
                    break;
                case 5:
                    searchCustomer();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Choice again");
                    break;
            }
        }
    }

    private void searchCustomer() {
        System.out.print("Enter code: ");
        String code = RegexHandler.checkRegexEmployeeCode();
        Customer customerByCode = furamaController.findByCodeCustomer(code);
        System.out.println(customerByCode);
    }

    private void deleteCustomer() {
        System.out.print("Enter code: ");
        String code = RegexHandler.checkRegexEmployeeCode();
        Customer customerBycode = furamaController.findByCodeCustomer(code);
        if (customerBycode != null) {
            furamaController.remove(code);
            System.out.println("Delete");
        } else {
            System.out.println("no see: ");
        }

    }

    private void editCustomer() {
        System.out.print("Enter code: ");
        String code = RegexHandler.checkRegexEmployeeCode();
        Customer customer = this.furamaController.findByCodeCustomer(code);
        if (customer != null) {
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
            System.out.print("Enter customer type: ");
            String customerType = scanner.nextLine();
            System.out.print("Enter address: ");
            String address = scanner.nextLine();
            customer.setName(name);
            customer.setDate(date);
            customer.setIdentity(identity);
            customer.setPhoneNumber(phoneNumber);
            customer.setGmail(gmail);
            customer.setCustomerType(customerType);
            customer.setAddress(address);
            this.furamaController.updateCustomer(customer);
        }

    }

    private void addNewCustomer() {
        System.out.print("Enter code: ");
        String code = RegexHandler.checkCodeCustomer();
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
