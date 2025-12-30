package com.demo.dsa.stacks;

import java.util.Scanner;
import java.util.Stack;

/* Read strings from standard input
*  If string equals "-", pop string from stack and print
*  Otherwise, push string onto stack
*/
public class StackOfStrings {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        
        while (scanner.hasNext()) {
            String s = scanner.next();
            if (s.equals("-")) {
                if (!stack.isEmpty()) {
                    System.out.print(stack.pop() + " ");
                }
            } else {
                stack.push(s);
            }
        }

        scanner.close();
    }
}
