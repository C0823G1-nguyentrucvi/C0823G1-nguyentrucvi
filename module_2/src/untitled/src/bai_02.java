import java.util.Arrays;
import java.util.Scanner;

public class bai_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vào kí tự");
        String ss="aabcc";
        String ss2="adcaa";
        String[] ss1=ss.split(" ");
        String[] ss3=ss2.split(" ");
        System.out.println(Arrays.toString(ss1));
        int count=0;
        for (int i = 0; i < ss1.length; i++) {
            for (int j = 0; j < ss3.length; j++) {
                if(ss1[i]==ss3[j]){
                    count++;
                }
            }

        }

    }

}
