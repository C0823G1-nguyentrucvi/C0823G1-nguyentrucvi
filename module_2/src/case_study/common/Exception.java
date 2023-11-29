package case_study.common;

import java.util.Scanner;

public class Exception {
private static final Scanner scanner=new Scanner(System.in);
public static int checkInteger(){
    int value;
    while (true){
    try {
        value= Integer.parseInt(scanner.nextLine());
        break;
    }catch (NumberFormatException e){
        System.out.println("sai định dạng");

    }
}return value;
}
}
