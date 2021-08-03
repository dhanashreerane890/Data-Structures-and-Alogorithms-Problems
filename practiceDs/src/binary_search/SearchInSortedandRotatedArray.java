package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInSortedandRotatedArray {



    static int search(int arr[],int key,int low,int high) {

        int mid = (low + high) / 2;

        if (low > high) {
            return -1;
        }
        if (arr[mid] == key) {
            return mid;
        }
        // if left half is sorted.
        if (arr[low] <= arr[mid]) {

            if (arr[low] <= key && arr[mid] >= key) {
                return search(arr, key, low, mid - 1);
            } else {
                return search(arr, key, mid + 1, high);
            }
        }
        // if right half is sorted.
        else {

            if (arr[mid] <= key && arr[high] >= key) {
                return search(arr, key, mid + 1, high);
            } else {
                return search(arr, key, low, mid - 1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(search(arr,k,0,n-1));
    }
}



