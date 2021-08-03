package evaluation_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Substrings_starting_with_K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int i = 0; i < testcases; i++) {
            int N = scanner.nextInt();
            String input = scanner.next();
            String K = scanner.next();
            int count = 0;
            for (int j = 0; j < N; j++) {
                for (int m = j; m < N; m++) {
                    String Substring = "";
                    for (int n = j; n <= m; n++) {
                        Substring += input.charAt(n);
//                        System.out.println(Substring);
                    }
                    HashSet<String> hashSet = new HashSet<>();
                    for (int h = 0; h < Substring.length(); h++) {
                        hashSet.add(Substring);
                    }
                    Iterator iterator = hashSet.iterator();
                    for (int s = 0; iterator.hasNext(); s++) {
                        String value = (String) iterator.next();
                        if (value.charAt(0) == K.charAt(0)) {
                            count++;
                        }
                    }

                }
            }
            System.out.println(count);
        }
    }
}
