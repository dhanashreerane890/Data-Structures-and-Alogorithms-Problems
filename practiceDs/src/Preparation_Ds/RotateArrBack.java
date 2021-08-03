package Preparation_Ds;

import java.util.Scanner;

public class RotateArrBack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int t = 0; t < testCase; t++) {
            int n = scanner.nextInt();
            int givenValue = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            StringBuffer stringBuffer1=new StringBuffer();
            StringBuffer stringBuffer2=new StringBuffer();

           for(int j=0;j<n/2;j++) {
                 stringBuffer1.append(arr[j]);
                   System.out.println(stringBuffer1);
               }

                   }
               }



}
