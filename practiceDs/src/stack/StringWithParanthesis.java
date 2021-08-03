package stack;

import java.util.Scanner;
import java.util.Stack;

public class StringWithParanthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String str = scanner.nextLine();
        for (int j = 0; j < str.length(); j++) {
            if (stack.size() == 0) {
                if ((str.charAt(j) == '(') ||
                        (str.charAt(j) == '{') ||
                        (str.charAt(j) == '[')) {
                    stack.push(str.charAt(j));
                }
            } else {
                if (((str.charAt(j) == '}' && stack.peek() == '{') ||
                        (str.charAt(j) == ']' && stack.peek() == '[') ||
                        (str.charAt(j) == ')' && stack.peek() == '('))) {
                    stack.pop();

                } else if ((str.charAt(j) == '(') || (str.charAt(j) == ')') ||
                        (str.charAt(j) == '{') || (str.charAt(j) == '}') ||
                        (str.charAt(j) == '[') || (str.charAt(j) == ']')) {
                    stack.push(str.charAt(j));
                }
            }
        }
        if (stack.size() == 0) {
            System.out.println("balanced");
        } else {
            System.out.println("unbalanced");

        }
        stack.clear();
    }
}
