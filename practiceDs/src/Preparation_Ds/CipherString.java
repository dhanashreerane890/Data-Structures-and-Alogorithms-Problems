package Preparation_Ds;

import java.util.Scanner;

public class CipherString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int N= scanner.nextInt();
            String[]arr=new String[N];
            String ch = scanner.next();
            int count=1;

             for (int i=0;i<ch.length()-1;i++){
                 if(ch.charAt(i)==ch.charAt(i+1)){
                     count++;

                 }else {
                     System.out.print(ch.charAt(i));
                     System.out.print(count);
                     count=1;
                 }

                 if(i==ch.length()-2){
                     if(ch.charAt(i)==ch.charAt(i+1)){
                         System.out.print(ch.charAt(i));
                         System.out.print(count);
                     }else {
                         System.out.print(ch.charAt(i+1));
                         System.out.print(count);
                     }
                 }
             }
            if(arr.length==1){
                System.out.print(ch);
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
