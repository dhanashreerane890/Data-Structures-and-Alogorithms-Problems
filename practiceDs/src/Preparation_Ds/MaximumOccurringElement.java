package Preparation_Ds;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumOccurringElement {
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
            int max = Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
                max = Integer.max(max, map.getValue());


            }
            for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
                if(map.getValue()==max){
                    System.out.println(map.getKey());
                    break;
                }

            }
        }
    }

