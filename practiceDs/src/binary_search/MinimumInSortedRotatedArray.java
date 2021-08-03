package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumInSortedRotatedArray {

    public static int minSorted(int arr[], int low, int high)
    {
        while(low < high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == arr[high])
                high--;

            else if(arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return arr[high];
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
//        Arrays.sort(arr);

        System.out.println(minSorted(arr, 0, n - 1));

    }
}
