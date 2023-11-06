package ss2_loop_array.bai_tap;

import java.util.Scanner;

public class Image {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j <= 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i == j || i > j) {
                                System.out.print("*");
                            }
                        }
                        System.out.println();

                    }
                    System.out.println();
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i <= j) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();

                    }
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i <= j) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }  System.out.println();

                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i == j || i < j) {
                                System.out.print("*");
                            }
                        }
                        System.out.println();

                    }
            }
        }
    }
}
