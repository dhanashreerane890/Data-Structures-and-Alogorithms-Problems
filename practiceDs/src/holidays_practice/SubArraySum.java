package holidays_practice;

import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
               for(int k=i;k<=j;k++){
                   sum+=arr[k];
//                   System.out.print(arr[k]+" ");

               }
                System.out.print(sum+" ");
                sum=0;

            }
//            System.out.println();
        }

      //  -2 1 -3 4 -1 2 1 -5 4

    }
}
