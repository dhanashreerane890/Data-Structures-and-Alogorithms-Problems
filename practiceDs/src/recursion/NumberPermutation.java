package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberPermutation {

    public static List<Integer> printarr(int[]arr){


        List<Integer>list1=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            list1.add(arr[i]);
//                System.out.print(arr[i]+" ");
        }
        return list1;

    }
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static List<List<Integer>> permutations(int[] arr, int currentIndex, List<List<Integer>> list) {

        if (currentIndex == arr.length - 1) {
            list.add(printarr(arr));
            return list;

        }
        for (int i=currentIndex;i< arr.length;i++){
            swap(arr,i,currentIndex);
            permutations(arr,currentIndex+1, list);
            swap(arr,i,currentIndex);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        List<List<Integer>>list=new ArrayList<>();

        permutations(arr,0,list);
        for (int i=0;i<list.size();i++){
            for (int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }

}