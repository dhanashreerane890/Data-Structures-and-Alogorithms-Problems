package postfix_to_infix;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix {

    static boolean isOperand(char x) {
        return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (isOperand(expression.charAt(i))) {
                stack.push(expression.charAt(i) + "");
            } else {
                String operand1 = stack.peek();
                stack.pop();
                String operand2 = stack.peek();
                stack.pop();
                stack.push("(" + operand2 + expression.charAt(i) + operand1 + ")");
            }
        }
        System.out.println(stack.peek());
    }
}
//ab+c-def-*g/+hij/*+

//A+(B*C)
//        ab+c-def-*g/+hij/*+