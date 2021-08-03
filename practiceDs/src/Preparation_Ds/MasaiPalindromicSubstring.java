package Preparation_Ds;

import java.util.Scanner;

public class MasaiPalindromicSubstring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.next();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<input.length();i++){
            for(int j=i;j<input.length();j++){
                String substring="";
                for(int k=i;k<=j;k++){
                    substring+=input.charAt(k);
                }
                String reverseSubString="";
                for(int s=substring.length()-1;s>=0;s--){
                    reverseSubString+=substring.charAt(s);
                }
                if(substring.equals(reverseSubString)){
                    max=Integer.max(max,substring.length());
                }
            }
        }
        System.out.println(max);
    }
}
