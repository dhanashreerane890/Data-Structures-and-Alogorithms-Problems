package holidays_practice;

import java.util.Scanner;

public class SmallestSubarrayWithSumGreaterThanX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int s = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.print(sum + " ");
                System.out.println();
                sum = 0;
            }
        }
//        int count=0;
//        int max=Integer.MIN_VALUE;
//        for (int i = 0; i <= sum; i++) {
//            if (sum %s != 0) {
//               max=Integer.max(sum,max);
//
//            }
//        }
//        System.out.println(max);
    }
}
