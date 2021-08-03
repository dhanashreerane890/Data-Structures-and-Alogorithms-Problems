package dsa_must_do_question;

import java.util.Scanner;

//ologn
//sp 0(1)
public class PowerOf2 {

    public static boolean powerOfTwo(int n){
        while (n>0){
            if(n==1){
                return true;
            }else if(n%2==0){
                n=n/2;
            }else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (powerOfTwo(n)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
