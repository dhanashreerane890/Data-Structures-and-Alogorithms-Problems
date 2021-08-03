package Preparation_Ds;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ThreeMaxThreeMinPlease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (n > 5) {
            LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                hashSet.add(arr[i]);
            }
            Iterator iterator = hashSet.iterator();
            for (int j = 0; iterator.hasNext(); j++) {
                int value = (int) iterator.next();
                if(hashSet.size()<6){
                    if (j <= 2) {
                        System.out.print(value + " ");
                    }
                    if (j == 2) {
                        System.out.println();
                    }if (j >= 2) {
                        System.out.print(value + " ");
                    }

                }else {
                    if (j <= 2) {
                        System.out.print(value + " ");
                    } else if (j >= hashSet.size() - 3) {
                        System.out.print(value + " ");
                    }

                    if (j == 2) {
                        System.out.println();
                    }
                }
            }
        }else {
            System.out.println("Not Possible");
            System.out.println("Not Possible");
        }
    }
}
