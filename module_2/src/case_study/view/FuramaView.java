package case_study.view;

import java.util.Scanner;

public class FuramaView {
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
            int choice = Exception.checkInteger();
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
       int choice = Integer.parseInt(scanner.nextLine());
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
       int choice = Integer.parseInt(scanner.nextLine());
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
      int  choice = Integer.parseInt(scanner.nextLine());
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
       int choice = Integer.parseInt(scanner.nextLine());
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

    private void showCustomerMenu() {
        while (true) {
            System.out.println("1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Delete customer\n" +
                    "5. Search by name customer\n" +
                    "6. Return main menu\n");
            System.out.print("Your choice: ");
            int choice = Exception.checkException();
            switch (choice) {
                case 1:
                    displayCustomer();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choice again");
                    break;
            }
        }
    }

    private void displayCustomer() {

    }
}
