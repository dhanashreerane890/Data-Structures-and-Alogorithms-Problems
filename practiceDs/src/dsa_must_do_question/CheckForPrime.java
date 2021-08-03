package dsa_must_do_question;

import java.util.Scanner;

public class CheckForPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isCheck=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isCheck=false;
                break;
            }

        }if(isCheck){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
