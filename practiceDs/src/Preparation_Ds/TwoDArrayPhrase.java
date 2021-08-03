package Preparation_Ds;

import java.util.Scanner;

public class TwoDArrayPhrase {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int count = 0;
            char[][] arr = new char[n][m];
            for (int i = 0; i < n; i++) {
                String temp = scanner.next();
                arr[i] = temp.toCharArray();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if ( i<n-3){
                        if(arr[i][j]=='s'&& arr[i+1][j]=='a'&& arr[i+2][j]=='b' && arr[i+3][j]=='a') {
                            count++;
                        }
                    }
                    if ( j<m-3){
                        if(arr[i][j]=='s' && arr[i][j+1]=='a' && arr[i][j+2]=='b' && arr[i][j+3]=='a' ) {
                            count++;
                        }
                    }
                    if (i<n-3 && j<m-3){
                        if(arr[i][j]=='s' && arr[i+1][j+1]=='a' && arr[i+2][j+2]=='b' && arr[i+3][j+3]=='a' ){

                            count++;
                        }
                    }

                    if (i>=3 && j<m-3) {
                        if(arr[i][j]=='s' && arr[i-1][j+1]=='a' && arr[i-2][j+2]=='b' && arr[i-3][j+3]=='a') {

                            count++;
                        }
                    }

                }
            }
            System.out.println(count);
        }
}
