package recursion;

import java.util.Scanner;

public class PalindromeString {

    static boolean palindrome(String name, int start, int end){
        if(start>=end){
            return true;
        }if(name.charAt(start) != name.charAt(end)){
            return false;
        }
        return palindrome(name,start+1,end-1);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name= scanner.next();
        if(palindrome(name,0,name.length()-1)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }


}
