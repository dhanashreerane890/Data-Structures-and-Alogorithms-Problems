package holidays_practice;

import java.util.Scanner;

public class MoveAllZerosPresentToEnd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int arr[]=new int[N];
        for(int t=0;t<N;t++){
            arr[t]= scanner.nextInt();
        }
        for(int i=0;i<N;i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < N; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
        for(int s=0;s<N;s++){
            System.out.print(arr[s]+" ");
        }
    }
}
