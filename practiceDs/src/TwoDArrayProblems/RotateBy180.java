package TwoDArrayProblems;

import java.util.Scanner;

public class RotateBy180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int k = 0; k < testcases; k++) {
            int N = scanner.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            for (int i = N - 1; i >= 0; i--) {
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print((arr[i][j]) + " ");
                }
                System.out.println();
            }

        }
    }
}