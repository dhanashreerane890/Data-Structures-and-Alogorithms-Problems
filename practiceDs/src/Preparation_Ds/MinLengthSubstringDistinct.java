package Preparation_Ds;

import java.util.*;

public class MinLengthSubstringDistinct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String totalChar = distinctChar(s);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String initial = "";
                for (int k = i; k <= j; k++) {
                    initial += s.charAt(k);
                }
                if (initial.length() >= totalChar.length()) {
//                    System.out.println(initial + " " + initial.length());
                    String aaa = distinctChar(initial);
                    if (aaa.length() >= totalChar.length()) {
//                       System.out.println(initial + " " + initial.length());
                        min = Integer.min(min, initial.length());
                    }
                }
            }
        }
        System.out.println(min);
    }

    public static String distinctChar(String s) {
        String outPut = "";
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                int count = hashMap.get(s.charAt(i)) + 1;
                hashMap.put(s.charAt(i), count);
            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            outPut += map.getKey();
        }

        return outPut;
    }


}