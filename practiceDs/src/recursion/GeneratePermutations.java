package recursion;


import java.util.Scanner;

public class GeneratePermutations {


    public static void printarr(int[]arr){
        System.out.println("");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static  void permutations( int[] arr,int currentIndex) {
        if (currentIndex == arr.length - 1) {
            printarr(arr);
            return;
        }
        for (int i=currentIndex;i< arr.length;i++){
            swap(arr,i,currentIndex);
            permutations(arr,currentIndex+1);
            swap(arr,i,currentIndex);
    }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        permutations(arr,0);
    }
}
