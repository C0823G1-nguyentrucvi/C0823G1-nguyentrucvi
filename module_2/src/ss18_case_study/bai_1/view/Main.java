package ss18_case_study.bai_1.view;

import java.util.Scanner;

public class Main {
  //  private final FuramaController furamaController = new FuramaController();
   private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            DisPlayMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tDelete customer\n" +
                            "5.\tSearch by name customer\n" +
                            "6.\tReturn main menu\n");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                    }
                    break;
                case 3:


                    break;
                case 4:

                    break;
                case 5:

                case 6:
                    System.exit(6);
                    break;
            }


        } while (true);
    }

    private static void DisPlayMenu() {
        System.out.println("1.\tEmployee Management\n" +
                "2.\tCustomer Management\n" +
                "3.\tFacility Management \n" +
                "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" +
                "6.\tExit\n");
    }
}
