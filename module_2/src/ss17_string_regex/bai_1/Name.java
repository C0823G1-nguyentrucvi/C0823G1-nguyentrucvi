package ss17_string_regex.bai_1;

import java.util.Scanner;

public class Name {
    private static final String REGEX = "^[CAP][0-9]{4}[GHIK]$";

    public static void main(String[] args) {
        System.out.println(" nhập tên lớp đi ạ : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name.matches(REGEX));
    }
}
