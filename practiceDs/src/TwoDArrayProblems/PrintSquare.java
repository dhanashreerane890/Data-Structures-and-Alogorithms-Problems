package TwoDArrayProblems;

import java.util.Scanner;

public class PrintSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==0||i==N-1||j==N-1||j==0){
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
