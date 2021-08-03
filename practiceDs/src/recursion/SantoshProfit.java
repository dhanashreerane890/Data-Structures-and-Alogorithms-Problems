package recursion;

import java.util.Scanner;

public class SantoshProfit {

    public static int Count(int N) {
        if (N == 0) {
            return 1;
        } else if (N < 0) {
            return 0;
        }

        int result1 = Count(N - 4);
        int result2 = Count(N - 8);

        int totalSum = result1 + result2;
        return totalSum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int N = scanner.nextInt();
            System.out.println(Count(N));
        }
    }
}
