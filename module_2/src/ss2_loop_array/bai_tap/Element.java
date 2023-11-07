package ss2_loop_array.bai_tap;


import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        int number;
        Scanner element = new Scanner(System.in);
        System.out.println("nhập số nguyên tố");
        number = element.nextInt();
        System.out.println("kết quả");
        int count;
        int countPrime = 0;
        int n = 2;
        while (countPrime <= number) {
            count=0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(n);
                countPrime++;
            }
            n++;
        }
    }
}
