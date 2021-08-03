package unit_3;

import java.util.Scanner;

public class DetectiveL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        String [] output= new String[testcases];

        for (int i = 0; i < testcases; i++) {
            output[i]="";
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] matrix = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    matrix[j][k] = scanner.nextInt();
                }
            }

            int row=n;
            for (int L = 0; L < m; L++) {
                for (int s = 0; s < row; s++) {
                    output[i]+=matrix[s][L]+" ";
                }
                for (int r = L+1; r < m; r++) {
                    output[i]+=matrix[row-1][r]+" ";
                }
                row=row-1;
            }
        }
        for(int i=0;i<testcases;i++){
            System.out.println(output[i]);
        }
    }
}
