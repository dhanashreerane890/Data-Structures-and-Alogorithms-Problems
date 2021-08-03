package unit_2;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 0; i < N; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            } else if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}


