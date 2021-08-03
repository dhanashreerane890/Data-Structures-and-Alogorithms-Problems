package stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Stack<Integer> stack = new Stack<>();
            stack.push(arr[0]);
            for (int i = 1; i < n; i++) {
                while (!stack.empty() && stack.peek() < arr[i]) {
                    System.out.print(arr[i] + " ");
                    stack.pop();
                }
                stack.push(arr[i]);

            }
            while (!stack.isEmpty()) {
                System.out.print("-1" + " ");
                stack.pop();
            }
            System.out.println();

        }
    }
}

