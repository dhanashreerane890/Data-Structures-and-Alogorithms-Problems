package recursion;

import java.util.Scanner;

public class BeyondFactorial {

    public static float Factorial(int N){
        if(N==1){
            return 0;
        }
        return (float) (Factorial(N-1) + Math.log(N));

    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N= scanner.nextInt();
        System.out.format("%.4f",Factorial(N));
    }
}
