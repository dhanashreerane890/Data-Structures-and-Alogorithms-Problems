package Preparation_Ds;

import java.util.Arrays;
import java.util.Scanner;

public class MakeWaveOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        int temp;
        //i can do also i+=2 in place of i++
        for(int i=0;i<n-1;i++){
            if(i%2==0){
               if( arr[i]< arr[i+1]){
                   temp=arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1]=temp;
               }
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
}
