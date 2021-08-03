package TwoPointerAproach;

import java.util.Arrays;
import java.util.Scanner;

public class Triplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean isCheck1=false;
        Arrays.sort(arr);
        for(int i=0;i<N-2;i++){
            if(triplex(arr,-arr[i],i+1)){
                isCheck1=true;
                break;
            }

        }if(isCheck1){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }


    public static boolean triplex(int arr[], int K, int i) {
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] > K) {
                j--;
            } else if (arr[i] + arr[j] < K) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

}
