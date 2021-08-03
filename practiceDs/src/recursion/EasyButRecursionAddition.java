package recursion;

import java.util.Scanner;

public class EasyButRecursionAddition {



    static int addition(int []arr,int N){
        if(N==-1){
            return 0;
        }
        int prevNum=addition(arr, N-1);
            return arr[N] +prevNum;
        }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testcases= scanner.nextInt();
        for(int i=0;i<testcases;i++){
            int N= scanner.nextInt();
            int arr[]=new int[N];
            for(int j=0;j<N;j++){
                arr[j]= scanner.nextInt();
            }
            System.out.println(addition(arr,N-1));
        }
    }
}
