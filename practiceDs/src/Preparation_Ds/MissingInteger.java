package Preparation_Ds;

import java.util.Arrays;
import java.util.Scanner;

public class MissingInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String arr[]=str.split(" ");
        int arr1[]=new int[arr.length];
        for(int j=0;j< arr1.length;j++){
            arr1[j]= Integer.parseInt(arr[j]);
        }
        Arrays.sort(arr1);
        for(int i=0;i< arr1.length-1;i++){
            if(!((arr1[i]+1)==(arr1[i + 1]))){
                System.out.println((arr1[i]) + 1);
               break;
            }
        }

    }
}
