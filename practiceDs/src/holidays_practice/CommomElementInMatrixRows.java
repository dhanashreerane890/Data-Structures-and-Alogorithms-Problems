package holidays_practice;

import java.util.Scanner;

public class CommomElementInMatrixRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int coln = scanner.nextInt();
        int[][] arr = new int[row][coln];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coln; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int count=1;
        int finalCount=0;
        for(int i=0;i<coln;i++) {
            int temp = arr[0][i];
            for (int k = 1; k < row; k++) {
                for (int j = 0; j < coln; j++) {
                    if (arr[k][j] == temp) {
                        count++;
                        break;
                    }
                }
                if(count==row){
                    finalCount++;
                    count=0;

                }
            }
            System.out.println(finalCount);
                finalCount=0;
        }
    }
}
