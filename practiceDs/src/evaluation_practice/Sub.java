package evaluation_practice;

import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String input = scanner.next();
        int val;
        for (int m = 0; m < N/2; m++) {
                String substring = "";
            for (int s = m; s < N/2; s++) {
                    substring += input.charAt(s);
                    System.out.println(substring);
                }
                for(int i=N/2;i<N;i++){
               substring+=input.charAt(i);
                System.out.println(substring);

            }
            }
        }
    }

