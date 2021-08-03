package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class DiscoverNumber {


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
        Scanner scanner=new Scanner(System.in);
        int N1=scanner.nextInt();
        int N2= scanner.nextInt();
        int []arr1=new int[N1];
        for(int i=0;i<N1;i++){
            arr1[i]= scanner.nextInt();
        }
        int arr2[]=new int[N2];
        for(int j=0;j<N2;j++){
            arr2[j]= scanner.nextInt();
        }
        Arrays.sort(arr1);

        for(int j=0;j<N2;j++){
            if(binarySearch(arr1,0,N1-1,arr2[j])){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }
}
