package recursion;

import java.util.Scanner;

public class NickAndHack {

    static boolean Amount(long given, long Number) {
        if (given == Number) {
            return true;
        } else if (given < Number) {
            return Amount(given * 10, Number) || Amount(given * 20, Number);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long given = 1;
        for (int i = 0; i < N; i++) {
            long Number = scanner.nextLong();
            if (Amount(given, Number)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
