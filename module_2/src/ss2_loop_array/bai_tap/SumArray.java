package ss2_loop_array.bai_tap;

import java.util.Scanner;

public class SumArray {
    public static int sum(int[][] arr) {
        Scanner now=new Scanner(System.in);
        int sum = 0;
        System.out.println("nhập cột muốn tính tổng");
        int rn=now.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (rn == j) {
                    sum+=arr[i][j];


                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap cột");
        int row = scanner.nextInt();
        System.out.println("nhập hàng");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }

        }
        System.out.print("tổng"+sum(arr));
    }
}
