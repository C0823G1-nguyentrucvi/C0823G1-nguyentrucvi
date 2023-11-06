package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        float usd = money.nextFloat();
        float vnd=23000*usd;
        System.out.println(usd+ "đổi sang vnd:"+vnd);
    }
}
