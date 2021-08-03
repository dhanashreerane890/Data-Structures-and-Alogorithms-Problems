package TwoDArrayProblems;

import java.util.Scanner;

public class SpiralTraversal2 {
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
            int count=0;
            int count1=0;
            for(int i=0;i<coln;i++){
                for(int j=row-i-1;j>=i;j--){
                    System.out.print(matrix[j][i]+" ");
                    if(j==i){
                        for(int k=i+1;k<coln-i;k++){
                            System.out.print(matrix[j][k]+" ");
                            if(k==coln-i-1){
                                for(int s=i+1;s<row-i;s++){
                                    count++;
                                    System.out.print(matrix[s][k]+" ");
                                    if( s==row-i-1){
                                        for(int r=coln-i-2;r>i;r--){
                                            count1++;
                                            System.out.print(matrix[s][r]+" ");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }if(count==0 ||count1==0){
                    break;
                }
                count=0;
                count1=0;
            }
            System.out.println();
        }
    }
}
