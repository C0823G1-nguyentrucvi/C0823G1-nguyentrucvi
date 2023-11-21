package ss0_sap_sep_bot_noi;

import java.util.Arrays;

public class ViDu {
    public static void main(String[] args) {
        int[] array = {9, 5, 8, 4, 6};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
        System.out.println(Arrays.toString(array));
    }
}
