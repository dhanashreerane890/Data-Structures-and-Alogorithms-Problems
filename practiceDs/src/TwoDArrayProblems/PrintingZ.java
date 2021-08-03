package TwoDArrayProblems;

import java.util.Scanner;

public class PrintingZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int N = scanner.nextInt();
            int[][] matrix = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    for (int j = 0; j < N - 1; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }

                }

                for (int k = N - 1; k >= 0; k--) {
                    if (i + k == N - 1 ) {
                        System.out.print(matrix[i][k] + " ");
                    }
                }

                if (i == N - 1) {
                    for (int s = 1; s < N; s++) {
                        System.out.print(matrix[i][s] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

}



