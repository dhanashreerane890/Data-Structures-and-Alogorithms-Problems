package Preparation_Ds;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateArrayBack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCase= scanner.nextInt();
        for (int t=0;t<testCase;t++) {
            int n = scanner.nextInt();
            int givenValue = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            if (givenValue < n && n>2) {
                int index = 0;
                for (int j = 0; j < n; j++) {
                    if (j == givenValue) {
                        index = j;
                        break;
                    }
                }
                if (index == 0) {
                    for (int k = index; k < arr.length; k++) {
                        System.out.print(arr[k]+" ");
                    }
                } else {
                    for (int k = index + 1; k < n; k++) {
                        System.out.print(arr[k]+" ");
                    }
                    for (int a = 0; a <= index; a++) {
                        System.out.print(arr[a]+" ");
                    }
                }
            } else {
                if (givenValue % 2 == 1) {
                    for (int j = n - 1; j >= 0; j--) {
                        System.out.print(arr[j]+" ");

                    }
                } else if (givenValue % 2 == 0) {
                    for (int m = 0; m < n; m++) {
                        System.out.print(arr[m]+ " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
