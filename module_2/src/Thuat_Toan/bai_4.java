package Thuat_Toan;

import java.util.Arrays;

public class bai_4 {
    public static void main(String[] args) {
        String a = "CodegymDaNang";
        String[] b = a.split("");
        String[] arr = new String[b.length];
        String c=" ";
        for (int i = 0; i < b.length; i++) {
            if (b[i] == b[0]) {
                arr[i] += b[i].toLowerCase();
            } else if (b[i].equals(b[i].toUpperCase()) && b[i - 1].equals(b[i - 1].toLowerCase())) {
                arr[i] += c+ b[i].toLowerCase();
            } else if (b[i].equals(b[i].toLowerCase())) {
                arr[i] += b[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
