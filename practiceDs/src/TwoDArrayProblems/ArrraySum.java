package TwoDArrayProblems;

import java.util.Scanner;

public class ArrraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int sum = scanner.nextInt();
        int matrix[][] = new int[rows][cols];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i < rows - 2) {
                    int total = matrix[i][j] + matrix[i + 1][j] + matrix[i + 2][j];
                    if (total == sum)
                        count++;
                }
                if (j < cols - 2) {
                    int total = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2];
                    if (total == sum)
                        count++;
                }
                if (i < rows - 2 && j < cols - 2) {
                    int total = matrix[i][j] + matrix[i + 1][j + 1] + matrix[i + 2][j + 2];
                    if (total == sum)
                        count++;
                }
                if (i >= 2 && j < cols - 2) {
                    int total = matrix[i][j] + matrix[i - 1][j + 1] + matrix[i - 2][j + 2];
                    if (total == sum)
                        count++;
                }
            }

        }
        System.out.println(count);
    }
}
