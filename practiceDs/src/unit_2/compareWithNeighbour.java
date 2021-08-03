package unit_2;

import java.util.Scanner;
public class compareWithNeighbour {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[]=new int[N];
        int count=0;
        for (int i=0;i<N;i++){
            arr[i]= scanner.nextInt();
        }
        for(int i=1;i<N-1;i++){
            if(arr[i]>arr[i-1] &&arr[i]>arr[i+1]){
                count++;
            }
        }
        if(arr[0]>arr[1]){
            count++;
        }
        if(arr[N-1]>arr[N-2]){
            count++;
        }
        System.out.println(count);
    }
}
