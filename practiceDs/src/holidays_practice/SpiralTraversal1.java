package holidays_practice;

import java.util.Scanner;

public class SpiralTraversal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int row = scanner.nextInt();
            int coln = scanner.nextInt();
            int matrix[][] = new int[row][coln];
            for (int m = 0; m < row; m++) {
                for (int n = 0; n < coln; n++) {
                    matrix[m][n] = scanner.nextInt();
                }
            }
            for(int i=0;i<row;i++){
                for(int j=i;j<coln-i;j++){
                    System.out.print(matrix[i][j]+" ");
                    if(j==coln-i-1){
                        for(int k=i+1;k<row-i;k++){
                            System.out.print(matrix[k][j]+" ");
                            if(k==row-i-1){
                                for(int s=coln-i-2;s>=i;s--){
                                    System.out.print(matrix[k][s]+" ");
                                    if(s==i){
                                        for(int m=row-i-2;m>i;m--){
                                            System.out.print(matrix[m][s]+" ");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
