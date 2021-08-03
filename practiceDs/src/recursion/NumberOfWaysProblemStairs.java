package recursion;

import java.util.Scanner;

public class NumberOfWaysProblemStairs {

    public static int Count(int N) {
        if (N == 1) {
            return 1;
        } else if (N == 0) {
            return 1;
        } else if (N == 2) {
            return 2;
        }

        int result1= Count(N-1);
        int result2=Count(N-2);
        int result3=Count(N-3);
         int totalSum=result1 + result2 + result3;
         return totalSum;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(Count(N));
    }
}
