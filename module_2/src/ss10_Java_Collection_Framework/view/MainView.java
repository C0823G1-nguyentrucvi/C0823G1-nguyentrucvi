package ss10_Java_Collection_Framework.view;

import java.util.Scanner;

public class MainView {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("xin chào bạn đến với thế giới sữa");
        ProductView productView = new ProductView();
        int choice;
        do {
            System.out.println("1.quản lý sản phẩm");
            System.out.println("0.thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productView.menuProduct();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);


    }

}
