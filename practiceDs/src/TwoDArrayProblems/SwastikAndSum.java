package TwoDArrayProblems;

import java.util.Scanner;

public class SwastikAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= row / 2; i++) {
            sum1 +=array[i][0];
        }
        for (int j = 1; j < column; j++) {
            sum1 +=array[row / 2][j];
        }
        for (int i = (row / 2) + 1; i < row; i++) {
            sum1 +=array[i][column - 1];
        }

        //sum2
        for (int j = 0; j <= column / 2; j++) {
            sum2 +=array[row - 1][j];
        }
        for (int i = row - 2; i >= 0; i--) {
            sum2 +=array[i][column / 2];
        }
        for (int k = (column / 2) + 1; k < column; k++) {
            sum2 +=array[0][k];
        }
        int diff = Math.abs(sum1 - sum2);
        System.out.println(diff);
    }
}



