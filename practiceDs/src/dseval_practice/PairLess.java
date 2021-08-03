package dseval_practice;

import java.util.Scanner;

/*
You are given an array A of N integers, and an integer K.
Find the maximum value of S, such S that S = a[i] + a[j], and S < K.
If no such value exists, then print -1.
2
5
1 2 3 4 5
7
3
30 10 20
15
Sample Output 1

6
-1
 */
public class PairLess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int i = 0; i < testcases; i++) {
            int N = scanner.nextInt();
            int arr[] = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }
            int temp = 0;
            int K = scanner.nextInt();
            boolean check1 = false;
            int s = 0;
            for (int m = 0; m < N - 1; m++) {
                for (int n = m + 1; n < N; n++) {
                    /*
You are given an array A of N integers, and an integer K.
Find the maximum value of S, such S that S = a[i] + a[j], and S < K.
If no such value exists, then print -1.*/
                    s = arr[m] + arr[n];
                    if ((s < K)) {
                        if (s > temp) {
                            temp = s;
                            check1 = true;
                        }
                    }
                }
            }
            if (check1) {
                System.out.println(temp);
            } else {
                System.out.println("-1");
            }
        }
    }
}