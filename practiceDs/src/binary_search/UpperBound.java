package binary_search;

import java.util.Scanner;

public class UpperBound {

    static int upperBound(int arr[], int low, int high, int k, int ans)
    {

        if (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k){
                return upperBound(arr, mid+1, high, k,mid);
            }
            else if (arr[mid] > k){
                return upperBound(arr, low, mid - 1, k,ans);
            }
            else {
                return upperBound(arr, mid + 1, high, k,mid);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        int k= scanner.nextInt();
        int val=upperBound(arr,0, arr.length-1,k,-1);

        System.out.println(val+1);
    }
}
//10 3
//0 2 4 4 5 5 7 7 9 10


