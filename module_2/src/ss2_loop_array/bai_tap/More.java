package ss2_loop_array.bai_tap;

import java.util.Scanner;

public class More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vị trí muốn thêm ");
        int more = scanner.nextInt();
        System.out.println("nhap số muốn thêm ");
        int count = 0;
        int[] array = {1, 2, 3, 4, 5, 0, 0};
        int index = scanner.nextInt();
        if (index >= 0 && index < array.length) {
            int[] arr = new int[array.length + 1];
            System.out.println("result");
            for (int i = 0; i < arr.length; i++) {
                if (i == index) {
                    arr[i] = more;
                    count++;
                    continue;
                }
                if (count == 0) {
                    arr[i] = array[i];
                } else {
                    arr[i] = array[i - 1];
                }
            }
            for (int i : arr) {
                System.out.print(i+",");
            }
        }else {
            System.out.println("o");
        }
    }
}
