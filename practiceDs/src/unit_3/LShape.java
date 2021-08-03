package unit_3;

import java.util.Scanner;

public class LShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt() ;
            for (int s = 0; s < testcases; s++){
                int n = scanner.nextInt();
            int m = scanner.nextInt();
            int arr[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(arr[j][i] + " ");

                    if (j == n - i - 1) {
                        for (int k = i + 1; k < m; k++)
                            System.out.print(arr[j][k] + " ");
                    }
                }
            }
        }
    }
}
