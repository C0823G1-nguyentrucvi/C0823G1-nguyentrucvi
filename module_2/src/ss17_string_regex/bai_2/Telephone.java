package ss17_string_regex.bai_2;

import java.util.Scanner;

public class Telephone {
    private static final String PHONE = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static void main(String[] args) {
        System.out.println("nhap so dien thoại");
        Scanner scanner = new Scanner(System.in);
        String telephone = scanner.nextLine();
        while (true) {
            if (phone(telephone)) {
                break;
            } else {
                System.out.println("sai định dạng");
                System.out.println("nhap so dien thoại");
                telephone = scanner.nextLine();
            }

        }
        System.out.println("định dạng đúng");

    }

    public static boolean phone(String telephone) {
        return telephone.matches(PHONE);
    }
}
