package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIterative {

    public static boolean binarySearch(int []arr,int low,int high,int k){

        while (low<=high ){
            int mid = low + (high - low) / 2;
            if(arr[mid]==k){
              return true;
            }else if(arr[mid]>k){
                high=mid-1;
            }else if(arr[mid]<k){
                low=mid+1;
            }

            if( high < arr.length){
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k= scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
       if( binarySearch(arr,0,n-1,k)){
           System.out.println("1");
       }else {
           System.out.println("-1");
       }

    }
}
