package ss9_DSA_stack.bai_1;

import javax.swing.*;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ViMap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi vào lẹ lên cho mình làm việc bạn nhé : ");
        String chu = scanner.nextLine();
        String[] array = chu.split(" ");
        int count=0;
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i].toLowerCase())) {
                count=1;
                map.put(array[i], count);
            } else {

                map.put(array[i], map.get(array[i].toLowerCase())+1);
            }

        }
        System.out.println(map);
    }
}
