package ss9_DSA_stack.bai_1;

import java.util.Arrays;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        int[] arr={1,0,1,1,2,4};
        for (int i = 0; i <arr.length ; i++) {
            myStack.push(arr[i]);
        }
        while (!myStack.empty()) {
            System.out.println(myStack.pop());

        }

        String tui="fake truc vi";
      String[] ten= tui.split(" ");
        Stack<String> myStack1=new Stack<>();
        for (int i = 0; i < ten.length; i++) {
            myStack1.push( ten[i]);
        }
            while (!myStack1.empty()){
                System.out.println(myStack1.pop());
            }


    }
}
