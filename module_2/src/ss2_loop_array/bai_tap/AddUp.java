package ss2_loop_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[6];
        int[] arr2 = new int[4];
        int[] arr3 = new int[arr1.length + arr2.length];
        int indexOfArr2 = 0;
        System.out.println("Enter 6 elements of array 1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter 4 elements of array 2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[indexOfArr2];
            indexOfArr2++;
        }
        System.out.println("Elements in array3: ");
        System.out.print(Arrays.toString(arr3));
    }
}

