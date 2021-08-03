package sorting_unit3;

import java.util.Scanner;
public class SortOut{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int k = 0; k < N; k++)
            arr[k] = scanner.nextInt();
        int[] arr2 = new int[N];
        for (int i = 0; i < N; i++) {
            arr2[i] = arr[i];
        }
        int swap;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[min]) {
                    swap = arr[j];
                    arr[j] = arr[min];
                    arr[min] = swap;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0;j<N;j++ ){
                if(arr[i]==arr2[j]){
                    System.out.print(j + " ");
                }
            }
        }
    }
}