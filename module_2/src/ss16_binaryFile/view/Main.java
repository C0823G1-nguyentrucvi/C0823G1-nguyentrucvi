package ss16_binaryFile.view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductView productView = new ProductView();
        int choice;
        do {
            System.out.println("1.quản lý sản phâm");
            System.out.println("0.thoát");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    productView.menuProduct();
                case 0:
                    System.exit(0);

            }
        } while (true);
    }
}
