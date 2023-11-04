package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumbersIntoWords {
    public static void main(String[] args) {
        int number;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("nhap số bạn muốn tim :");
        number = Scanner.nextInt();
        String[] array1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen"};
        if (number >= 0 && number < 14) {
            System.out.println(array1[number]);
        } else if (number > 13 && number < 20) {
            System.out.printf("%s teen", array1[number - 10]);
        } else if (number >= 20 && number < 100) {
            if (number % 10 == 0) {
                System.out.printf("%s ty", array1[number / 10]);
            } else {
                System.out.printf("%s ty %s", array1[number / 10], array1[number % 10]);
            }
        } else if (number >= 100 && number < 1000) {
            if (number % 100 == 0) {
                System.out.printf("%s hundred", array1[number / 100]);
            } else {
                System.out.printf("%s hundred %s ty %s", array1[number / 100], array1[(number % 100) / 10], array1[((number % 100) % 10)]);
            }
        }
    }
}



