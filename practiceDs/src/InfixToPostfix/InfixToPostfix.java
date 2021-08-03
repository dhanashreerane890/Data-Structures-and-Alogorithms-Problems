package InfixToPostfix;

import java.lang.*;
import java.util.*;

public class InfixToPostfix {

    public static int priority(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '^') {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if ((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')){
                stringBuilder.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stringBuilder.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && stack.peek() != '(' &&
                        priority(ch) <= priority(stack.peek())) {
                    stringBuilder.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        System.out.println(stringBuilder.toString());
    }
}
