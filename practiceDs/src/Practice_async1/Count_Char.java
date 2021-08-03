package Practice_async1;

import java.util.Scanner;

public class Count_Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            String S = scanner.next();
            int count = 1;
            for (int i = 0; i < S.length() - 1; i++) {
                if (S.charAt(i) == S.charAt(i + 1)) {
                    count++;
                } else {
                    System.out.print(S.charAt(i));
                    System.out.print(count);
                    count = 1;
                }
                if (i == S.length() - 2) {
                    if (S.charAt(i) == S.charAt(i + 1)) {
                        System.out.print(S.charAt(i));
                        System.out.print(count);
                    } else {
                        System.out.print(S.charAt(i + 1));
                        System.out.print(count);
                    }
                }
            }
        }
    }
}
