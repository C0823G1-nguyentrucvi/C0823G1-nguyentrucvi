package ss11_indexOf.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // int[] arr = {0, 10, 2, 9, 4, 5, 6};
        System.out.println("nhập chiều dài của mảng:");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử "+i);
            arr[i]=scanner.nextInt();
        }
        int left = 0;
        int right = 0;
        System.out.println(Arrays.toString(arr));
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhập value từ bàn phím: ");
        int value = scanner.nextInt();
        System.out.println(binarySearch(arr,left,right,value));
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (left > right) {
            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                binarySearch(arr, middle + 1, right, value);
            } else {
                binarySearch(arr, left, middle - 1, value);
            }
        }
        return -1;


    }


}
