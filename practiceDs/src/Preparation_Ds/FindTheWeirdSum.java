package Preparation_Ds;


import java.util.Arrays;
import java.util.Scanner;

public class FindTheWeirdSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testcases= scanner.nextInt();
        for(int t=0;t<testcases;t++){
            int n= scanner.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++) {
                arr[j] = scanner.nextInt();
            }
            Arrays.sort(arr);
            boolean ischeck=false;
            int i=0;
            int j= arr.length-2;
            while (i<j){
                if((arr[i]+arr[j])> arr[n-1]){
                    j--;
                }else if((arr[i]+arr[j])<arr[n-1]){
                    i++;
                }else {
                    ischeck=true;
                    break;
                }
            }
            if(ischeck){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }


    }

}
