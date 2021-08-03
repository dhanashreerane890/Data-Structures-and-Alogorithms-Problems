package Preparation_Ds;

import java.util.Scanner;

public class NoddyExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] <= X && count2<=1 ) {
                    count++;
                }
             else if (arr[i] > X ) {
                count2++;
            }
             else if(count2==1){
                 break;
            }
        }
        System.out.println(count);

    }
}
