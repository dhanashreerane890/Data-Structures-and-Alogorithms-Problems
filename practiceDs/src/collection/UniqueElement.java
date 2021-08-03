package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int N = scanner.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if (hashMap.containsKey(arr[i])) {
                    int count = hashMap.get(arr[i]);
                    hashMap.put(arr[i], count + 1);
                } else {
                    hashMap.put(arr[i], 1);
                }
            }
            for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
                if (map.getValue() == 1) {
                    System.out.print(map.getKey() + " ");
                }
            }
            System.out.println();
        }

    }
}
