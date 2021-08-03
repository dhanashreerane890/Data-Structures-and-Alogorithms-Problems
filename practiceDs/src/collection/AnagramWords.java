package collection;

import java.util.HashMap;

public class AnagramWords {
    public static void main(String[] args) {
        String hello = "cycee";
        String helol = "ecyce";
        HashMap<Character, Integer> hashmap1 = new HashMap<>();
        HashMap<Character, Integer> hashmap2 = new HashMap<>();
        for (int i = 0; i < hello.length(); i++) {
            if (hashmap2.containsKey(hello.charAt(i))) {
                int count=hashmap2.get(hello.charAt(i));
                hashmap2.put(hello.charAt(i),count+1);
            } else {
                hashmap2.put(hello.charAt(i), 1);
            }
        }
        for (int i = 0; i < helol.length(); i++) {
            if (hashmap1.containsKey(helol.charAt(i))) {
                int count=hashmap1.get(helol.charAt(i));
                hashmap1.put(helol.charAt(i),count+1);

            } else {
                hashmap1.put(helol.charAt(i), 1);
            }
        }
        if (hashmap2.equals(hashmap1)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
