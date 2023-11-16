package ss9_DSA_stack.bai_1;

import java.util.*;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        Stack<String> myStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao tui di ma: ");
        String str = scanner.nextLine();
        String[] b = str.split("");
        for (int i = 0; i < b.length; i++) {
            myStack.push(b[i].toLowerCase());
        }
        while (!myStack.empty()) {
            myQueue.add(myStack.pop());
        }
        System.out.println(Arrays.toString(b).equalsIgnoreCase(myQueue.toString()));

    }

}
