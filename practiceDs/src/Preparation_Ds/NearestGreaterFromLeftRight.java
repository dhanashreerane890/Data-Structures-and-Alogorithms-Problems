package Preparation_Ds;

import java.util.Scanner;

public class NearestGreaterFromLeftRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int count = 0;
            int count1 = 0;
            int count2=0;
            for (int i = 0; i < n; i++) {
                if (i > 0 && arr[i] < arr[i - 1]) {
                    count = 1;
                    System.out.print(arr[i - 1] + " ");
                }


                if (count != 1) {
                    for (int k = i + 1; k < n; k++) {
                        if (arr[i] < arr[k]) {
                            count1 = 1;
                            System.out.print(arr[k] + " ");
                            break;
                        }
                    }
                }
                if (count!=1 && count1==0){
                    for (int j=i-1;j>=0;j--){
                        if (arr[i]<arr[j]){
                            System.out.print(arr[j]+" ");
                            count2++;
                            break;
                        }
                    }
                }
                if (count == 0 && count1 == 0 && count2==0) {
                    System.out.print("-1" + " ");
                }
                count = 0;
                count1 = 0;
                count2 = 0;
            }
            System.out.println();
        }
    }
}
