package unit_2;

import java.util.Scanner;
public class countSuchPairs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N =scanner.nextInt();
        int Sum=scanner.nextInt();
        int arr[]=new int[N];
        int count=0;
        for(int i =0;i<N;i++){
            arr[i]= scanner.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i]+arr[j]==Sum){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
