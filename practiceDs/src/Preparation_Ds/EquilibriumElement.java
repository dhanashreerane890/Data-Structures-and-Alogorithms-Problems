package Preparation_Ds;

import java.util.Scanner;

public class EquilibriumElement {


    static int equilibriumElement(int arr[], int n)
    {

        int leftsum, rightsum;

        for (int i = 0; i < n; i++) {

            leftsum = 0;
            for (int j = 0; j < i; j++) {
                leftsum += arr[j];
            }
            rightsum = 0;
            for (int j = i + 1; j < n; j++) {
                rightsum += arr[j];
            }

            if (leftsum == rightsum)
                return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();

        }
        System.out.println(equilibriumElement(arr,n));

    }
}
