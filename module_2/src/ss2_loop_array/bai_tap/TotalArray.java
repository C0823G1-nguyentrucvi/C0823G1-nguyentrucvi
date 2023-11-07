package ss2_loop_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TotalArray {

    public static int total(int[][]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
           sum+=arr[i][i] ;
           sum+=arr[i][arr.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập  hàng ");
        int row = input.nextInt();
        System.out.println("nhap cột ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhập phần tử"+"["+i+"]"+"["+j+"]");
                arr[i][j] = input.nextInt();
            }

        }System.out.println("tổng"+total(arr));

    }
}
