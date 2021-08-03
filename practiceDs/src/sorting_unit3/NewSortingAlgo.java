package sorting_unit3;

import java.util.Scanner;

public class NewSortingAlgo {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[]arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]= scanner.nextInt();
            }
            int swap;
            for (int i = 0; i < N - 1; i++) {
                for (int j = 0; j < N -i-1; j++) {
                    if (arr[j]%M > arr[j + 1]%M) {
                        swap = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = swap;
                    }
                }
            }
            for (int k = 0; k < N; k++)
                System.out.print(arr[k] + " ");
        }
    }


