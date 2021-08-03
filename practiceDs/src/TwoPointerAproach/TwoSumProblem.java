package TwoPointerAproach;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int K= scanner.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        boolean ischeck=false;
        int i=0;
        int j= arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]>K){
                j--;
            }else if(arr[i]+arr[j]<K){
                i++;
            }else {
                ischeck=true;
                break;
            }
        }
        if(ischeck){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }


}
