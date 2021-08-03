package Preparation_Ds;

import java.util.Scanner;

public class DetectPalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String num= scanner.next();
        String dummy="";
        for(int i=num.length()-1;i>=0;i--){
            dummy+=num.charAt(i);
        }
        if(num.equals(dummy)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
