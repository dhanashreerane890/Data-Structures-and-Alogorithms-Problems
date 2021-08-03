package unit_2;

import java.util.Scanner;
public class NegativeCountSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= scanner.nextInt();
        }
        int count=0;
        for(int i=0;i<N;i++){
            if(arr[i]<0){
                count++;

            }
        }
        System.out.println(count);
    }

}
