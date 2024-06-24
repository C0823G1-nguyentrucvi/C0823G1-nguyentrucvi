import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class on1 {
    public static void main(String[] args) {
        Queue<Integer> queues = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            queues.add(i);
        }
        System.out.println(queues);

        System.out.println("mời bạn nhập số.");
        Scanner scanner = new Scanner(System.in);
        Long N = scanner.nextLong();
        scanner.close();
        for (int i = 0; i < N; i++) {
            int first = queues.poll();
            queues.add(first);
            queues.add(first);


        }
        System.out.println("ouput");
        System.out.println(queues.poll());

    }


}
