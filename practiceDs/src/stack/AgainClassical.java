package stack;

import java.util.Scanner;
import java.util.Stack;

public class AgainClassical {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            String str = scanner.next();

            if (str.length() % 2 == 0) {
                for (int j = 0; j < str.length(); j++) {
                    if (stack.isEmpty()) {
                        stack.push(str.charAt(j));
                    } else if ((stack.peek() == '{' && str.charAt(j) == '}') ||
                            (stack.peek() == '(' && str.charAt(j) == ')') ||
                            (stack.peek() == '[' && str.charAt(j) == ']')) {
                        stack.pop();
                    } else {
                        stack.push(str.charAt(j));
                    }

                }
                if (stack.isEmpty()) {
                    System.out.println("Balanced");
                } else {
                    System.out.println("Not balanced");
                }
            } else {
                System.out.println("Not Balanced");
            }
        }
    }
}
