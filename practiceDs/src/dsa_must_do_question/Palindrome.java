package dsa_must_do_question;

import java.util.Scanner;

//TC =0(N)
//sc =0(1)
public class Palindrome {

    public static boolean checkPalindrome(String name) {
        int left = 0;
        int right = name.length() - 1;
        while (left <= right) {
            if (name.charAt(left) != name.charAt(right)) {
                return false;
            } else{
                left++;
                right--;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if (checkPalindrome(name)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }

}
