package TwoDArrayProblems;

import java.util.Scanner;

public class DetectiveL {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testcases= scanner.nextInt();
        for(int t=0;t<testcases;t++){
            int Row= scanner.nextInt();
            int coln= scanner.nextInt();
            int matrix[][]=new int[Row][coln];
            for(int m=0;m<Row;m++){
                for (int n=0;n<coln;n++){
                    matrix[m][n]= scanner.nextInt();
                }
            }
            for(int j=0;j<coln;j++){
                for(int i=0;i<Row-j;i++){
                    System.out.print(matrix[i][j] + " ");
                    if(i==Row-1-j){
                        for(int k=j+1;k<coln;k++){
                            System.out.print(matrix[i][k]+" ");
                        }
                    }
                }
            }
        }

    }
}
