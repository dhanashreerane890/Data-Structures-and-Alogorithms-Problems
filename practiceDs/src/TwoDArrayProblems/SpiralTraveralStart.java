package TwoDArrayProblems;

import java.util.Scanner;

public class SpiralTraveralStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int count=0;
        int count2=0;

        for (int i = 0; i < n; i++) {

            for (int k = i; k < n - i; k++) {

                System.out.print(arr[i][k] + " ");

                if (k == n - i -1 ) {
                    for (int s =i+1; s<n - i; s++) {

                        System.out.print(arr[s][k] + " ");
                        if (s == n - i - 1) {
                            for (int p = n - i-2 ; p >= i; p--) {

                                count++;
                                System.out.print(arr[s][p] + " ");
                                if (p==i){
                                    for (int j = n - i-2; j >i; j--) {
                                        count2++;
                                        System.out.print(arr[j][p] + " ");
                                    }
                                }

                            }

                        }
                    }
                }
            }
            if (count==0 || count2==0){
                break;
            }
            count=0;
            count2=0;

        }
    }
}