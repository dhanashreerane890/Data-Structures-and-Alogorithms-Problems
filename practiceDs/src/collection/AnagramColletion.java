package collection;

import java.util.Scanner;
import java.util.HashMap;


public class AnagramColletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        HashMap<Character, Integer> hashmap1 = new HashMap<>();
        HashMap<Character, Integer> hashmap2 = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            if (((A.charAt(i) >= 97) && (A.charAt(i) <= 122))||
                    ((A.charAt(i) >= 65) && (A.charAt(i) <= 90))) {
                if (hashmap2.containsKey(A.charAt(i))) {
                    int count = hashmap2.get(A.charAt(i)) + 1;
                    hashmap2.put(A.charAt(i), count);
                } else {
                    hashmap2.put(A.charAt(i), 1);
                }
            }
        }
        for (int i = 0; i < B.length(); i++) {
            if (((B.charAt(i) >= 97) && (B.charAt(i) <= 122))||
                    ((B.charAt(i) >= 65) && (B.charAt(i) <= 90))) {
                if (hashmap1.containsKey(B.charAt(i))) {
                    int count = hashmap1.get(B.charAt(i)) + 1;
                    hashmap1.put(B.charAt(i), count);
                } else {
                    hashmap1.put(B.charAt(i), 1);
                }
            }
        }
        if (hashmap2.size() == hashmap1.size()) {
            if (hashmap2.equals(hashmap1)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("False");
        }

    }

}//   c  2
