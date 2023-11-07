package ss2_loop_array.bai_tap;

import java.util.Scanner;

public class MinArray {
    public static int min(int[][] arr){
        int min= arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập hàng");
        int row=scanner.nextInt();
        System.out.println("nhap cột");
        int col=scanner.nextInt();
        int[][] arr= new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=scanner.nextInt();
            }

        }
        System.out.println("kết quả min");
        System.out.println(min(arr));
    }
}
