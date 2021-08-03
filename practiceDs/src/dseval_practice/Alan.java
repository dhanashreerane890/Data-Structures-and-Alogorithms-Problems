package dseval_practice;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        String input = scanner.next();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (hashMap.containsKey(input.charAt(i))) {
                int count = hashMap.get(input.charAt(i));
                hashMap.put(input.charAt(i), count + 1);
            } else {
                hashMap.put(input.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            System.out.println(map.getKey() + "-" + map.getValue());
        }
    }
}



