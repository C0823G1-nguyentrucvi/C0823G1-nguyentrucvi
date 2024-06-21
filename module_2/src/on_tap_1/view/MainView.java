package on_tap_1.view;

import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hi chào cậu");
        PupilView pupilView = new PupilView();
        int choice;
        do {
            System.out.println("1.Quản Lý Sinh Viên");
            System.out.println("0.thoát");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    pupilView.menu();
                    break;
                case 0:
                    System.exit(0);

            }

        } while (true);
    }


}
