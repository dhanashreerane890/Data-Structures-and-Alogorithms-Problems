package holidays_practice;

import java.util.Scanner;

public class MaxLength2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int len=0;
        int index=-1;
        boolean isCheck = false;
        for(int i=0;i<N;i++) {
            int sum=0;
            for (int m = i+1; m < N; m++) {
                sum = sum + arr[m];
                if (sum == 8) {
                    if (len < i - m + 1)
                    {
                        len = i - m+ 1;
                        index = i;
                    }
                }

            }
        }
        System.out.println("["+(index-len+1)+" "+len+" ]");

    }
}
//5 6 -5 5 3 5 3 -2 0