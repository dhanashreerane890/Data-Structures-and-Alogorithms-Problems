package recursion;

import java.util.Scanner;

public class RecursionProduct {

    static int prod(int N){
        if(N==1){
            return 1;
        }
        int val=prod(N-1);
        return N*val;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(prod(N));
    }
}
