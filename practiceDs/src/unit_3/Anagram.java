package unit_3;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        boolean isAnagram = false;
        boolean repeated[] = new boolean[B.length()];
        if (A.length() == B.length()) {
            for (int i = 0; i < A.length(); i++) {
                if (((A.charAt(i) >= 97) && (A.charAt(i) <= 122)) ||
                        ((A.charAt(i) >= 65) && (A.charAt(i) <= 90))) {
                    isAnagram = false;
                    for (int j = 0; j < B.length(); j++) {
                        if (((B.charAt(i) >= 97) && (B.charAt(i) <= 122)) ||
                                ((B.charAt(i) >= 65) && (B.charAt(i) <= 90))) {
                            if (A.charAt(i) == B.charAt(j) && !repeated[j]) {
                                repeated[j] = true;
                                isAnagram = true;
                                break;
                            }
                        }
                        if (!isAnagram) {
                            break;
                        }
                    }
                }
            }
        }
        if (isAnagram) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
