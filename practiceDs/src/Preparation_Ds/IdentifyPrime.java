package Preparation_Ds;

import java.util.Scanner;

public class IdentifyPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }if(isPrime){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
