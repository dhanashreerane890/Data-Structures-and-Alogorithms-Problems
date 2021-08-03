package holidays_practice;

import java.util.Scanner;

public class MaxProdTwoInteger {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N= scanner.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= scanner.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int max_i=-1;
        int max_j=-1;
        for(int i=0;i< N-1;i++){
            for(int j=i+1;j<N;j++){
                if(max<(arr[i]*arr[j])){
                    max=arr[i]*arr[j];
                    max_i=i;
                    max_j=j;
                }

            }
        }
        System.out.print(arr[max_i] + "," +arr[max_j]);
    }

}
