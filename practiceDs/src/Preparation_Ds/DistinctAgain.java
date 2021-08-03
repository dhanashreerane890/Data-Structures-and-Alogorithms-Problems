package Preparation_Ds;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        int sum = 0;
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            sum += map.getKey();

        }
        System.out.println(sum);
    }
}

