package dsa_must_do_question;

import java.util.Scanner;

public class NumberToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        StringBuffer stringBuffer = new StringBuffer();
        while (num>0){
            if(num%2==0){
              stringBuffer.append(" "+0);
            }else {
                stringBuffer.append(" "+1);
            }
            num=num/2;
        }
        System.out.println(stringBuffer.reverse());
    }
}
