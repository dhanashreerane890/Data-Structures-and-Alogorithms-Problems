package TwoDArrayProblems;

import java.util.Scanner;

public class SwaAndSum {
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
        int sum1=0;
        int sum2=0;
        for(int i=0;i<(row/2)+1;i++){
            System.out.print(array[i][0]+" ");
           sum1+=array[i][0];
        }for(int j=1;j<column;j++){
//            System.out.print(array[row/2][j]+" ");
           sum1+=array[row/2][j];
        }for(int k=(row/2)+1;k<row;k++){
//            System.out.print(array[k][column-1]+" ");
            sum1+=array[k][column-1];
        }for(int s=column-1;s>=(column/2)+1;s--){
//            System.out.print(array[0][s]+" ");
            sum2+=array[0][s];
        }for(int m=0;m<row;m++){
//            System.out.print(array[m][(column/2)]+" ");
           sum2+=array[m][(column/2)];
        }for(int r=(column/2)-1;r>=0;r--){
//            System.out.print(array[row-1][r]+" ");
            sum2+=array[row-1][r];
        }
        System.out.println();
        int totalSum=Math.abs(sum1-sum2);
        System.out.println(totalSum);
    }
}
//        3 5
//        1 2 3 4 5
//        6 7 8 9 10
//        11 12 13 14 15