package unit_2;

import java.util.Scanner;
class PalindromeSubString {
    //    thisracecarisgood
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr = scanner.next();
        String output = "";
        int maxLength = 0;
        for (int i = 0; i < arr.length(); i++) {
            for (int j = i; j < arr.length(); j++) {
                String subString = "";
                for (int k = i; k <= j; k++) {
                    subString += arr.charAt(k);
                }
                String reversedString = "";
                for (int k = subString.length() - 1; k >= 0; k--) {
                    reversedString += subString.charAt(k);
                }
                if (subString.equals(reversedString)) {
                    if (subString.length() > maxLength) {
                        maxLength = subString.length();
                        output = subString;
                    }
                }
            }
        }
        System.out.println(maxLength + " " + output);
    }
}