package binary_search;

import java.util.Scanner;

public class LowerBound {


    static int lowerBound(int arr[], int low, int high, int k, int ans)
    {

        if (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k){
                return lowerBound(arr, low, mid - 1, k,mid);
            }
            else if (arr[mid] > k){
                return lowerBound(arr, low, mid - 1, k,ans);
            }
            else {
                return lowerBound(arr, mid + 1, high, k,ans);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println( lowerBound(arr,0, arr.length-1,k,-1));
    }
}
