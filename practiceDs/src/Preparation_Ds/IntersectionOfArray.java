package Preparation_Ds;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        int arr1[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = scanner.nextInt();
        }
        int arr2[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr2[i] = scanner.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;
//3
//4 5 7
//9 2 5

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]){
                i++;
            } else {
                j++;
            }
        }


    }

}
