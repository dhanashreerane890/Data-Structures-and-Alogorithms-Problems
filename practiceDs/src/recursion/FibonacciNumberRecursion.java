package recursion;

import java.util.Scanner;

public class FibonacciNumberRecursion {

    static int fib(int N){
        if(N==0 ||N==1){
            return N;
        }
        int prevFib1=fib(N-1);
        int prevFib2=fib(N-2);
        return prevFib1+prevFib2;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(fib(N));
    }
}
