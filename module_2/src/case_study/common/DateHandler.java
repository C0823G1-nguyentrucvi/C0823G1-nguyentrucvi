package case_study.common;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateHandler {
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String is18YearOld() {
        while (true) {
            String birthdayStr = ExceptionHandler.checkParseDate();

            LocalDate birthday = LocalDate.parse(birthdayStr, formatter);

            LocalDate now = LocalDate.now();
            Period age = Period.between(birthday, now);
            if (age.getYears() >= 18) {
                return birthdayStr;
            } else {
                System.out.println("Less than 18 year old!!");
                System.out.print("Try again: ");
            }
        }
    }
}
