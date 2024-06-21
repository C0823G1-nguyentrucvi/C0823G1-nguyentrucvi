package case_study.common;

import java.util.Scanner;

public class RegexHandler {
    private static final String REGEX_EMPLOYEE_CODE = "^NV-[0-9]{4}$";
    private static final String REGEX_NAME = "^[A-Z]([a-z]*)(\\s[A-Z]([a-z]*))*$";
    private static final String REGEX_IDENTITY = "[1-9]{9,12}$";
    private static final String REGEX_PHONE = "^[0][0-9]{9}$";
    private static final String REGEX_CUSTOMER_CODE = "^KH-[0-9]{4}$";
    private static final String REGEX_VILLA = "^SVVL-[0-9]{4}$";
    private static final String REGEX_HOUSE = "^SVHO-[0-9]{4}$";

    private static final String REGEX_ROOM = "^SVRO-[0-9]{4}$";
    private static final String REGEX_NAME_VHR = "^[A-Z]{1}[a-z]$";


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

//    public static int checkMoney() {
//        int value = scanner.nextInt();
//        if (value < 1 && value > 20) {
//            System.out.println("Enter again: ");
//            value = scanner.nextInt();
//        }
//        return value;
//    }

    public static String checkCodeCustomer() {
        String value = scanner.nextLine();
        if (!String.valueOf(value).matches(REGEX_CUSTOMER_CODE)) {
            System.out.println("Enter again: ");
            value = scanner.nextLine();
        }

        return value;
    }

    public static String checkVilla() {
        String value = scanner.nextLine();
        if (!String.valueOf(value).matches(REGEX_VILLA)) {
            System.out.println("Enter again:");
            value = scanner.nextLine();
        }
        return value;
    }

    public static String checkHouse() {
        String value = scanner.nextLine();
        if (!String.valueOf(value).matches(REGEX_HOUSE)) {
            System.out.println("Enter again:");
            value = scanner.nextLine();
        }
        return value;
    }

    public static String checkRoom() {
        String value = scanner.nextLine();
        if (!String.valueOf(value).matches(REGEX_ROOM)) {
            System.out.println("Enter again:");
            value = scanner.nextLine();
        }
        return value;
    }

    public static String checkName() {
        String value = scanner.nextLine();
        if (!String.valueOf(value).matches(REGEX_NAME_VHR)) {
            System.out.println("Enter again: ");
            value = scanner.nextLine();
        }

        return value;
    }

    public static Double checkArea() {
        Double value = scanner.nextDouble();
        if (value >= 30) {
            System.out.println("Enter again: ");
            value = scanner.nextDouble();
        }
        return value;
    }
}
