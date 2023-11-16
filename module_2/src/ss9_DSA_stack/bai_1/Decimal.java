package ss9_DSA_stack.bai_1;

import java.util.Scanner;
import java.util.Stack;

public class Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so ");
        int number = scanner.nextInt();
        Stack<Integer> myStack = new Stack<>();
        for (int i = number; i >= 1; i=i/2) {
           if(i%2==0){
               myStack.push(0);
           }else {
               myStack.push(1);
           }
        }
        while (!myStack.empty()){
            System.out.println(myStack.pop());
        }
    }
    }

