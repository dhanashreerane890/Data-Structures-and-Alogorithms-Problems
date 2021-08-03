package evaluation_practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SumOfTheNextSmaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int N = scanner.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
//            Stack<Integer>stack=new Stack<>();
//            int temp=0;
//            for(int i=0;i<N;i++) {
//                if (stack.isEmpty()) {
//                    stack.push(arr[i]);
//                } else {
//                    if (stack.peek() > arr[i] ) {
//                        temp += arr[i];
//                        stack.push(arr[i]);
//                    } else {
//                        stack.push(arr[i]);
//
//                        }
//                    }
//                }
//            System.out.println(temp);
//            }

            int temp = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (arr[i] > arr[j]) {
                        temp += arr[j];
                        break;
                    }
                }
            }
            System.out.println(temp);
        }
    }
}
