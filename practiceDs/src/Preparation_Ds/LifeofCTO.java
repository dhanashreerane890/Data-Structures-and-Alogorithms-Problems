package Preparation_Ds;

import java.util.Scanner;

public class LifeofCTO {

    static int  lifeOfCto(int[] arr,int high,int low){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==1){
                return mid;
            }
           else if(arr[mid]==arr[low] || arr[mid]<arr[high]){
                low=mid+1;
            }else if(arr[low]<arr[mid]){
                high=mid;
            }
        }return -1;


    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println(lifeOfCto(arr,0,n-1));

    }

}
