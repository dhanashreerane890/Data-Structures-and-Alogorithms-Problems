package holidays_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ConsecutiveLargestSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        String val = "";
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if ((arr[i] == arr[j]) && (arr[j] != arr[j - 1])) {
                    val += arr[j];
                    set.add(val);
                }
            }
        }

        Iterator iterator = set.iterator();
        for (int k = 0; iterator.hasNext(); k++) {
            int value = (int) iterator.next();


        }

    }


}
