package Thuat_Toan;

import java.util.Arrays;
import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr = "Abcdef";
        String arr2 = "Adghjklbc";
        String[] arr1 = arr.split("");
        String[] arr4 = arr2.split("");
        int count;
        int sum = 0;
       // System.out.println(arr1.length);
     //   System.out.println(arr4.length);
        for (int i = 0; i < arr1.length; i++) {
            count = 0;
            for (int j = 0; j < arr4.length; j++) {
                if (arr1[i].equals(arr4[j])) {
                    count++;
                }
            }
            // System.out.println(count);
            if (count != 0) {
                sum += 1;

            }


        }
        System.out.println("chữ giống nhau"+sum);
    }
}
