package case_study.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class ExceptionHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static int checkParseInteger() {
        int value;
        while (true) {
            try {
                value = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
                System.out.print("Try again: ");
            }
        }
        return value;
    }

    public static double checkParseDouble() {
        double value;
        while (true) {
            try {
                value = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
                System.out.print("Try again: ");
            }
        }
        return value;
    }

    public static String checkParseDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Input date (mm/dd/YYYY): ");
        String input;
        LocalDate dateInput;
        while (true) {
            try {
                input = scanner.nextLine();
                dateInput = LocalDate.parse(input, formatter);
                break;
            } catch (Exception e) {
                System.out.println("Wrong format");
                System.out.print("Try again: ");
            }
        }
        return dateInput.format(formatter);
    }

    public static void main(String[] args) {
        System.out.print("Enter: ");
        String dateStr = DateHandler.is18YearOld();
        System.out.println(dateStr);
    }
}
