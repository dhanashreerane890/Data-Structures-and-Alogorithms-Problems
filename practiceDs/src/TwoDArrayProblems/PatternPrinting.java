package TwoDArrayProblems;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int N= scanner.nextInt();
        for(int i=0;i<N;i++) {
            for (int j = 0; j < N; j++) {
                if (j == 0 || i == 0 || j == N - 1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
