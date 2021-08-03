package Preparation_Ds;

import java.util.Scanner;

public class MultiplicationWithoutMultipleOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n2; i++) {
            sum += n1;
        }
        System.out.println(sum);
    }
}
