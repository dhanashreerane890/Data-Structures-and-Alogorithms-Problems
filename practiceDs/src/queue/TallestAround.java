package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TallestAround {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int t = 0; t < testcases; t++) {
            int N = scanner.nextInt();
            int k = scanner.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

          int temp=Integer.MIN_VALUE;
            for(int i=0;i<N;i++){
                for(int j=i;j<=k;j++){
                    if(arr[j]<arr[j+1]){
                        temp=arr[j+1];
                            break;
                        }
                    }
                }
                System.out.println(temp);
            }

        }

        }


