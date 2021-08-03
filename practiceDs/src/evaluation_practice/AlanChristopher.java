package evaluation_practice;

import java.util.Scanner;
import java.util.Stack;

public class AlanChristopher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int i = 0; i < testcases; i++) {
            String expression = scanner.next();
            String value = "";
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < expression.length(); j++) {
                if (expression.charAt(j) == '#') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(expression.charAt(j));
                }

            }
            while (!stack.isEmpty()) {
                value += stack.pop();
            }
            for (int v = value.length() - 1; v >= 0; v--) {
                System.out.print(value.charAt(v));
            }
            System.out.println();
        }
    }
}
