package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class SearchTheEvil {
    static boolean binarySearch(int arr[], int low, int high, int k)
    {
        if (low<=high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == k){
                return true;
            }else if (arr[mid] > k){
                return binarySearch(arr, low, mid - 1, k);
            }else {
                return binarySearch(arr, mid + 1, high, k);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int n = scanner.nextInt();
            int m= scanner.nextInt();
            int arr[] = new int[n*m];
            for (int i = 0; i < arr.length; i++) {
                    arr[i] = scanner.nextInt();
                }
            Arrays.sort(arr);
            int k= scanner.nextInt();
            if(binarySearch(arr,0,arr.length-1,k)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

        }
    }
}
