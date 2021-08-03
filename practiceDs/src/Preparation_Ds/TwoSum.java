package Preparation_Ds;


import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            boolean ischeck = false;
            int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                if (arr[i] + arr[j] > K) {
                    j--;
                } else if (arr[i] + arr[j] < K) {
                    i++;
                } else {
                    ischeck = true;
                    break;
                }
            }
            if (ischeck) {
                System.out.println(i + " " + j);
            } else {
                System.out.println(-1 + " " + (-1));
            }
        }
    }
}
