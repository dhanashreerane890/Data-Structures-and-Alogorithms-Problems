package unit_2;

import java.util.Scanner;

class PrimeSumUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            Boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                sum=sum+i;
            }

        }
        System.out.println(sum);
    }
}
