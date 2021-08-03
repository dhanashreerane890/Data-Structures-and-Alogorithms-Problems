package Preparation_Ds;

import java.util.Scanner;

public class IsEvenSumPossible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
        int N= scanner.nextInt();
       int arr[]=new int[N];
       for(int i=0;i<N;i++){
           arr[i]= scanner.nextInt();
       }
       int sum=0;
       boolean isSum=false;
       for(int i=0;i<N;i++){
           for( int j=i;j<N;j++){
               sum+=arr[j];
               if(sum%2==0){
                   isSum=true;
                   break;
               }
           }
       }
       if(isSum){
           System.out.println("Yes");
       }else {
           System.out.println("No");
       }

        }
    }
}
