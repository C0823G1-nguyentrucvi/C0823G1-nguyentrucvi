package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        float Usd = money.nextFloat();
        float VND=23000*Usd;
        System.out.println(Usd+ "đổi sang vnd:"+VND);
    }
}
