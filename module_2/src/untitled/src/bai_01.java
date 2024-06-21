import java.util.Arrays;
import java.util.Scanner;

public class bai_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap do dai mang");
        int choice=scanner.nextInt();
        int[] arr=new int[choice];
        for (int i = 0; i < choice; i++) {
            System.out.println("phần tử: "+i);
            arr[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(check(arr));
    }
    public static boolean check(int[] arr){
        int count;
        int[] array=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    array[i]=count;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]==array[i+1]){
                return true;
        }
    }
        return false;
    }
}
