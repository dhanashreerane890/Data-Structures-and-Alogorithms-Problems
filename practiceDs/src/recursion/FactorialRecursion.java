package recursion;

import java.util.Scanner;

public class FactorialRecursion {

    static int factorial(int N) {
        if (N == 1) {
            return 1;
        }
        int previousFact = factorial(N - 1);
        return N * previousFact;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(factorial(N));
    }



}
