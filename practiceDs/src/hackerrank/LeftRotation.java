package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int j = k + 1; j < n; j++) {
                list.add(arr[j]);
                System.out.print(arr[j] + " ");
            }

            for (int m = 0; m <= k; m++) {
                list.add(arr[m]);
                System.out.print(arr[m] + " ");
            }
        }
    }
}

