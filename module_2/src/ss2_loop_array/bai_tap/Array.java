package ss2_loop_array.bai_tap;



public class Array {

    public static int maxArray(int[][] arr) {
        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
    };
        System.out.println(maxArray(arr));
    }


}
