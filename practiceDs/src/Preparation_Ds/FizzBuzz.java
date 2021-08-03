package Preparation_Ds;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testcases= scanner.nextInt();
        for(int i=0;i<testcases;i++){
            int N= scanner.nextInt();
            for(int j=1;j<=N;j++){
                if(j%3==0 &&j%5==0){
                    System.out.println("FizzBuzz");
                }else if(j%5==0){
                    System.out.println("Buzz");
                }
               else if(j % 3==0){
                    System.out.println("Fizz");
                }else {
                    System.out.println(j);
                }
            }

        }
        System.out.println();

    }
}
