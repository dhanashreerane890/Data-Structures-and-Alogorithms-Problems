package dsa_must_do_question;

import java.util.Scanner;

public class BinaryToNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String num = scanner.next();
        int sum=0;
        int j=0;
        for (int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='1'){
                sum+= Math.pow(2,j);

            }
            j++;
        }
        System.out.println(sum);

    }

}
