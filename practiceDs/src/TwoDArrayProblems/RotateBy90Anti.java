package TwoDArrayProblems;

import java.util.Scanner;
public class RotateBy90Anti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
       for(int i=N-1;i>=0;i--){
           for(int j=0;j<N;j++){
               System.out.print(arr[j][i] + " ");
           }
           System.out.println();
       }

    }
}
