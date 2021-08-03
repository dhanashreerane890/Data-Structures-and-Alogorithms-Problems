package evaluation_practice;

import java.util.Scanner;
import java.util.Stack;

public class MasaiCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int i = 0; i < testcases; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int arr[][] = new int[N][M];
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    arr[n][m] = scanner.nextInt();
                }
            }
            Stack<Integer> stack=new Stack<>();
            for (int s = 0; s < N; s++) {
                int temp=arr[s][0];
                for (int p = 1; p < M; p++) {
                    if(arr[s][p]>temp){
                        temp=arr[s][p];
                    }if(p==M-1){
                        stack.push(temp);
                        temp=0;
                        break;
                    }
                }
                System.out.print(stack.pop()+" ");
            }
            System.out.println();
        }
    }
}
