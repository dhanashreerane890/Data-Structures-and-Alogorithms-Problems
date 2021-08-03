package Preparation_Ds;

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
            for (int i = 0; i < n; i++) {
                if (stack.isEmpty()) {
                    stack.push(arr[i]);

                }
                while (!stack.isEmpty()) {
                    if (stack.peek() < arr[i]) {
                        System.out.println(arr[i]);
                        stack.push(arr[i]);


                    } else {
                        System.out.println("-1");
                        break;
                    }
                }
            }
        }
    }
}
