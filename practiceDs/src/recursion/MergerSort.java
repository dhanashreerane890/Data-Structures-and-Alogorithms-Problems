package recursion;

import java.util.Scanner;

public class MergerSort {

    static void mergeSort(int []arr, int low, int high){
        if(low<high){
             int mid=low +((high-low)/2);
            mergeSort(arr,low, mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
            }
        }
    static void merge(int []arr,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int arrL[]=new int[n1];
        int arrR[]=new int[n2];

        for(int i=0;i<n1;i++){
            arrL[i]=arr[i+low];
        }
        for(int j=0;j<n2;j++){
            arrR[j]=arr[j+mid+1];
        }
        int i=0;
        int j=0;
        int k=low;
        while (i<n1 && j<n2){
            if(arrL[i]<=arrR[j]){
                arr[k]=arrL[i];
                i++;
                k++;
            }else {
                arr[k]=arrR[j];
                j++;
                k++;
            }
        }
        while (i < n1) {
            arr[k] = arrL[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int arr[]=new int[N];
        for(int j=0;j<N;j++){
            arr[j]= scanner.nextInt();
        }
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
