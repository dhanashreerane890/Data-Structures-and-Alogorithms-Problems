package StackPractice;

import java.util.Scanner;
import java.util.Stack;

public class VowelCountStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.next();
        int count1 = 0;
        for (int i = 0; i < Name.length(); i++) {
            if (Name.charAt(i) == 'a' || Name.charAt(i) == 'e' ||
                    Name.charAt(i) == 'i' || Name.charAt(i) == 'o' ||
                    Name.charAt(i) == 'u') {
            }else {
                count1++;
            }
        }
        System.out.println(count1);

    }
}
