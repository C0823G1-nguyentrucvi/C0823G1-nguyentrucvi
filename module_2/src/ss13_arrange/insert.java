package ss13_arrange;

import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
        int[] array = {1, 9, 4, 3, 7, 5, 6, 8};
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] =array[pos-1];
                pos--;
            }
            array[pos]=x;
            System.out.println("lần thứ "+i+Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}
