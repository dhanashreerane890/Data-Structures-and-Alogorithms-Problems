package queueUsingStack;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        QueueUsingStack queueUsingStack = new QueueUsingStack();

        for (int i = 0; i < n; i++) {
            int condition = scanner.nextInt();
            if (condition == 0) {
                int value = scanner.nextInt();
                queueUsingStack.add(value);
            } else if (condition == 1) {
                System.out.println(queueUsingStack.peek());
            } else if (condition == 2) {
                queueUsingStack.remove();
            }
        }

    }

    public void add(int data) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.peek());
            stack1.pop();
        }
        stack1.push(data);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.peek());
            stack2.pop();
        }
    }

    public void remove() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue isEmpty");
        } else if (!stack1.isEmpty()) {
            stack1.pop();
        }
    }

    public int peek() {
        if (!stack1.isEmpty()) {
            return stack1.peek();
        }
        return 0;
    }
}

