package TwoDArrayProblems;

import java.util.Scanner;

public class N_Traversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int k = 0; k < testcases; k++) {
            int N = scanner.nextInt();
            int[][] matrix = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    for (int j = N - 1; j > 0; j--) {
                        System.out.print(matrix[j][i] + " ");
                    }
                }
                for (int s = 0; s < N; s++) {
                    if (i == s) {
                        System.out.print(matrix[s][i] + " ");
                    }
                }
                if (i == N - 1) {
                    for (int j = N - 2; j >= 0; j--) {
                        System.out.print(matrix[j][i] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
