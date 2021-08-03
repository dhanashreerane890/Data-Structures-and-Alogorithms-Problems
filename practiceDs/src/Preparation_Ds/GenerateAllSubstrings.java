package Preparation_Ds;

import java.util.Scanner;

public class GenerateAllSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        for (int t = 0; t < testCase; t++) {

            int n = scanner.nextInt();
            String s = scanner.next();

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    String aa =s.substring(i, j + 1);
                    System.out.println(aa);
//                    if (!aa.equals("")){
//                        System.out.println(aa);
//                    }

                }
            }
        }
    }
}

