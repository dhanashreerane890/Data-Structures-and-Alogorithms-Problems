package TwoDArrayProblems;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row = scanner.nextInt();
        int cols = scanner.nextInt();
        int arr[][]=new int[row][cols];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]= scanner.nextInt();
            }
        }
        for(int k=row-1;k>=0;k--){
            for(int m=cols-1;m>=0;m--){
                System.out.print(arr[k][m] + " ");
            }
            System.out.println(" ");
        }
    }
}
