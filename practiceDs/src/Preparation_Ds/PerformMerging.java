package Preparation_Ds;

import java.util.Arrays;
import java.util.Scanner;

public class PerformMerging {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int N= scanner.nextInt();
       int arrL[]=new int[N];
       for(int i=0;i<N;i++){
           arrL[i]=scanner.nextInt();
       }
       int arrR[]=new int[N];
        for(int j=0;j<N;j++){
            arrR[j]=scanner.nextInt();
        }
        int arr[]=new int[2*N];

        Arrays.sort(arrL);
        Arrays.sort(arrR);

        int i = 0;
        int j = 0;
        int k=0;
        while (i<N && j<N){
            if(arrL[i]<=arrR[j]){
                arr[k]=arrL[i];
                i++;
                k++;
            }else {
                arr[k]=arrR[j];
                j++;
                k++;
            }
        }
        while (i < N) {
            arr[k] = arrL[i];
            i++;
            k++;
        }
        while (j < N) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
        for(int a=0;a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }

    }
}
