package ss14_exception;

import java.util.Scanner;

public class TriangleException {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        double a =scanner.nextDouble();
        System.out.println("nhap b");
        double b = scanner.nextDouble();
        System.out.println("nhap c");
        double c = scanner.nextDouble();
        try {
            inputTriangle(a, b, c);
            System.out.println("đúng là tam giác");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Done ");
        }
    }

    private static void inputTriangle(double a, double b, double c) throws IllegalTriangleException {
        if ((a < 0 || b < 0 || c < 0 )|| (a + b <= c || a + c <= b || b + c <= a)) {
            throw new IllegalTriangleException("Khong phai canh tam giac");
        }
    }
}
