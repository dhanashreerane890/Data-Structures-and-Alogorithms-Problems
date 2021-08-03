package evaluation_practice;

import java.util.Scanner;

public class RowGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        for (int k = 0; k < testcase; k++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int arr[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            int count1=0;
            for (int i = 0; i < m; i++) {
                int  a=arr[0][i];
                int count=0;
                for (int j = 0; j < n  ; j++) {
                    if (arr[j][i]==a){
                        count++;
                    }
                }
                if (count==n){
                    count1++;
                }

            }
            for (int s=0;s<n;s++){
                for (int p=s+1;p<n;p++){
                    if (arr[0][s]==arr[0][p]){
                        count1--;
                    }
                }

            }
            System.out.println(count1);
        }
    }
}