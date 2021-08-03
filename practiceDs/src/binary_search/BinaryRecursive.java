package binary_search;

import java.util.Arrays;
import java.util.Scanner;

class BinaryRecursive {

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


    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        if (binarySearch(arr, 0, n - 1, k)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}