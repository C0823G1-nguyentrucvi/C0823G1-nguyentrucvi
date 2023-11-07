package ss2_loop_array.bai_tap;

import java.util.Scanner;

public class FirstString {
    public static int indexOf(String str,String kt){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(kt.charAt(0) == str.charAt(i)){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str="abcdsea";
        System.out.println("nhập chuỗi kí tự");
        String kt=input.nextLine();

            System.out.println("kí tự" + kt + "xuất hiện:");
        System.out.println(indexOf(str,kt));
    }
}
