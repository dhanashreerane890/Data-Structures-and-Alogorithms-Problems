package unit_2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.next();
        String reversed ="";
        for(int i =input.length()-1;i>=0;i--){
            reversed=reversed +input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.println("Yes");
        }else
            System.out.println("No");

    }
}
