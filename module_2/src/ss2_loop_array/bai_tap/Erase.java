package ss2_loop_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Erase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 0, 0};
        System.out.println("nhâp x là phần tử cần xóa");
        int deLe = scanner.nextInt();
        int tem = 0;
        int size = arr.length;
        int[] array = new int[size];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != deLe) {
                array[tem] = arr[i];
                tem++;

            }
        }

        System.out.println(Arrays.toString(array));
    }
}
