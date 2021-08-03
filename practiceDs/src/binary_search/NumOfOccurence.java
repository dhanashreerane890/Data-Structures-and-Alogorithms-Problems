package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class NumOfOccurence {


    static int binarySearch(int arr[], int low, int high, int k)
    {
        if (low<=high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == k){
                return mid;
            }else if (arr[mid] > k){
                return binarySearch(arr, low, mid - 1, k);
            }else {
                return binarySearch(arr, mid + 1, high, k);
            }
        }
        return -1;
    }


    static int binarySearchCount(int arr[], int len, int data)
    {
        // get the index of element
        int indexData = binarySearch(arr, 0,len-1,data);

        // get the leftCount
        int left = indexData - 1;
        int leftCount = 0;
        while(left>-1 && arr[left] == data)
        {
            leftCount++;
            left--;
        }

        // get the rightCount
        int right = indexData + 1;
        int rightCount = 0;
        while(right < len && arr[right] == data)
        {
            rightCount++;
            right++;
        }

        return (leftCount + 1 + rightCount);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(binarySearchCount(arr,n,k));
    }




}

