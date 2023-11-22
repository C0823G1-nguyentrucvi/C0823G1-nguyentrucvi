package ss13_arrange;


import java.util.Arrays;


public class insertionSort {
    public static void main(String[] args) {
        int[] list = {9, 6, 4, 5, 7, 8};
        System.out.println(Arrays.toString(insertionSort(list)));
    }

     public static int[] insertionSort(int[] list){
            int pos, x;
            for (int i = 1; i < list.length; i++) {
                x = list[i];
                pos = i;
                while (pos > 0 && x < list[pos - 1]) {
                    list[pos] = list[pos - 1];
                    pos--;
                }
                list[pos] = x;
            }
            return list;
        }
    }


