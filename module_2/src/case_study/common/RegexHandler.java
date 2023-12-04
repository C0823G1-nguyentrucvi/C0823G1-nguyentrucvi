package case_study.common;

import java.util.Scanner;

public class RegexHandler {
    private static final String REGEX_EMPLOYEE_CODE = "^NV-[0-9]{4}$";
    private static final String REGEX_NAME = "^[A-Z]([a-z]*)(\\s[A-Z]([a-z]*))*$";
    private static final String REGEX_IDENTITY = "[1-9]{9,12}$";
    private static final String REGEX_PHONE = "[0-9]{10}$";


    private static final Scanner scanner = new Scanner(System.in);

    public static String checkRegexEmployeeCode() {
        String value = scanner.nextLine();
        while (!String.valueOf(value).matches(REGEX_EMPLOYEE_CODE)) {
            System.out.print("Enter again: ");
            value = scanner.nextLine();
        }
        return value;
    }

    public static String checkRegexName() {
        String value = scanner.nextLine();
        while (!String.valueOf(value).matches(REGEX_NAME)) {
            System.out.println("Enter again: ");
            value = scanner.nextLine();
        }
        return value;
    }

    public static int checkRegexIdentity() {
        int value = Integer.parseInt(scanner.nextLine());
        while (!String.valueOf(value).matches(REGEX_IDENTITY)) {
            System.out.println("Enter again: ");
            value = Integer.parseInt(scanner.nextLine());
        }
        return value;
    }

    public static String checkPhoneNumber() {
        String value = scanner.nextLine();
        while (!String.valueOf(value).matches(REGEX_PHONE)) {
            System.out.println("Enter again: ");
            value = scanner.nextLine();
        }
        return value;
    }

    public static double checkMoney() {
        double value = scanner.nextDouble();
        if (value < 1) {
            System.out.println("Enter again: ");
            value = scanner.nextDouble();
        }
        return value;
    }
}
