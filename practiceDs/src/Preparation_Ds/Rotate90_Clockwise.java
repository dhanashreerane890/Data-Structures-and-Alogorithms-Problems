package Preparation_Ds;

import java.util.Scanner;

public class Rotate90_Clockwise {
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
            for(int j=0;j<N;j++){
            for(int i=N-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
