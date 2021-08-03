package binary_search;

import java.util.Scanner;

public class NumberofOccurencesinLogn {

    static int lowerBound(int arr[], int low, int high, int k,int count)
    {

        if (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k){
                count++;
                return lowerBound(arr, low, mid - 1, k,count) ;
            }
            else if (arr[mid] > k){
                return lowerBound(arr, low, mid - 1, k,count);
            }
            else {
                return lowerBound(arr, mid + 1, high, k,count);
            }
        }
        return count;
    }
    static int upperBound(int arr[], int low, int high, int k, int count1)
    {

        if (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k){
                count1++;
                return upperBound(arr, mid+1, high, k,count1);
            }
            else if (arr[mid] > k){
                return upperBound(arr, low, mid - 1, k,count1);
            }
            else {
                return upperBound(arr, mid + 1, high, k,count1);
            }
        }
        return count1;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
       int val1=lowerBound(arr, 0, arr.length-1,k,0);
        int val2=upperBound(arr,0,n-1,k,0);
        System.out.println((val1+val2)-1);
    }
}
