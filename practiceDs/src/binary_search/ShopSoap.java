package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class ShopSoap {

    static int shopSoap(int arr[], int low, int high, int k, int ans)
    {

        if (low<=high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == k){
                return mid;
            }

            else if (arr[mid] > k){
                return shopSoap(arr, low, mid - 1, k,ans);
            }

            else {
                return shopSoap(arr, mid + 1, high, k,mid);
            }
        }
        return ans+1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrSoaps = new int[n];
        for (int i = 0; i < n; i++) {
            arrSoaps[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[] arrQuery = new int[q];
        for (int j = 0; j < q; j++) {
            arrQuery[j] = scanner.nextInt();

        }
        Arrays.sort(arrSoaps);

        for (int i = 0; i < q; i++) {
            System.out.println( shopSoap(arrSoaps, 0, n - 1, arrQuery[i], 0));
        }
    }
}
