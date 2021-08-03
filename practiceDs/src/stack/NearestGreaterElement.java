package stack;

import java.util.Scanner;

public class NearestGreaterElement{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testcases= scanner.nextInt();
        for(int i=0;i<testcases;i++){
            int N= scanner.nextInt();
            int arr[]=new int[N];
            for(int j=0;j<N;j++){
                arr[j]= scanner.nextInt();
            }
            for (int K = 0; K < N; K++) {
                boolean check=false;
                int output=0;
                for (int m = K+1; m < N; m++) {
                    if (arr[K] < arr[m]) {
                        output=arr[m];
                        check=true;
                        break;
                    }
                }
                if(check){
                    System.out.print(output+" ");
                }
                else {
                    System.out.print(-1+" ");
                }
            }
            System.out.println();
        }
    }
}

