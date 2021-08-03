package StackPractice;

import java.util.Scanner;
import java.util.Stack;

public class SignalCapacity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 1;
        int count2 = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                System.out.println("1" + " ");
                stack.push(arr[i]);
            } else {
                if (stack.peek() > arr[i]) {
                    System.out.println(1 + " ");
                    stack.push(arr[i]);
                } else {
                    while (!stack.isEmpty()) {
                        if (stack.peek() < arr[i]) {
                            count++;
                            count2++;
                            stack.pop();
                        }else {
                            System.out.println(count2+" ");
                            stack.push(arr[i]);
                            break;
                        }
                        if (stack.isEmpty()) {
                            System.out.println(count + " ");
                            stack.push(arr[i]);
                            break;
                        }
                    }
                 count2 = 1;
                }
            }
        }
    }

}

