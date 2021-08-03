package Practice_async1;

import java.util.Scanner;
import java.util.Stack;

public class LongestSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int i = 0; i < testcases; i++) {
            int N = scanner.nextInt();
            int K= scanner.nextInt();
            int arr[] = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }
            Stack<String> stack = new Stack<>();
            String aa = "";
            int j = 0;
            for (j = 0; j < N; j++) {
                for (int k = j; k < N - 1; k++) {
                    if (arr[k] <= arr[k + 1]) {
                        aa += arr[k];
                    } else {
                        if (arr[k] > arr[k - 1]) {
                            aa += arr[k];
                            j = k;

                        }
                        break;
                    }
                }
                stack.push(aa);
                aa = "";

            }
            int result = 0;
            while (!stack.empty()) {
                String value = stack.pop();
                if (value.length() > result) {
                    result = value.length();
                }
            }
            System.out.println(result);
        }
    }
}
