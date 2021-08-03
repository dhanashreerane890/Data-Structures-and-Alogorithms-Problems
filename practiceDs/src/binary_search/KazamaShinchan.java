package binary_search;

import java.util.Scanner;

public class KazamaShinchan {

    static int kazamShinchan(int arr[], int low, int high, int k, int ans)
    {

        if (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k){
                return kazamShinchan(arr, mid+1, high, k,mid);
            }
            else if (arr[mid] > k){
                return kazamShinchan(arr, low, mid - 1, k,ans);
            }
            else {
                return kazamShinchan(arr, mid + 1, high, k,mid);
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
       int val= kazamShinchan(arr,0, arr.length-1,k,0);
     if(arr[val]==k){
         System.out.println(val);
     }else {
         System.out.println(val+1);
     }
    }
}
