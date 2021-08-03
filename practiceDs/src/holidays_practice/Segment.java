package holidays_practice;

import java.util.Scanner;

public class Segment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        int n = N / k;
        if (n * k == N) {
            for (int i = 0; i < n; i++) {
                for (int j = k * i; j < k * (i + 1); j++) {
                    if (arr[j] == x) {
                        count++;
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = k * i; j < k * (i + 1); j++) {

                    if (arr[j] == x) {
                        count++;
                        break;
                    }
                }
            }
            for (int m = n * k; m < N; m++) {
                if (arr[m] == x) {
                    count++;
                    break;
                }
            }
        }
        if (count >= n) {
            System.out.println("Yes");
            System.out.println(count);
        } else {
            System.out.println("No");
            System.out.println(count);
        }
    }
}

