package unit_3;

import java.util.Scanner;

public class SuchPairReturns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int i = 0; i < testcases; i++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int arr[] = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }
            boolean check=false;
            for(int m=0;m<N;m++){
                for(int n=m+1;n<N;n++){
                    if(arr[m]+arr[n]==K){
                        check=true;
                        break;
                    }
                }if(check){
                    break;
                }
            }if(check){
                System.out.println("1");
            }else {
                System.out.println("-1");
            }
        }
    }
}
