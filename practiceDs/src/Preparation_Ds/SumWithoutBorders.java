package Preparation_Ds;

import java.util.Scanner;

public class SumWithoutBorders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases= scanner.nextInt();
        for(int t=0;t<testcases;t++) {
            int row = scanner.nextInt();
            int coln = scanner.nextInt();
            int[][] arr = new int[row][coln];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < coln; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            int sum = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < coln; j++) {
                    if (i == 0 || i == row - 1 || j == coln - 1 || j == 0) {

                    } else {
                        sum += arr[i][j];
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
