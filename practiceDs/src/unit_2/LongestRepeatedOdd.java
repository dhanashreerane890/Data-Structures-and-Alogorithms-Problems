package unit_2;

import java.util.Scanner;
public class LongestRepeatedOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[]arr=new int[n];
        int count=1;
        int maximum =0;
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for (int i=1;i< n;i++){
            if(arr[i]%2==1 && arr[i]==arr[i-1]&& arr[i-1]%2 ==1){
                count++;
                if(count>maximum){
                    maximum =count;
                }
            }
            else {
                count=1;
            }
        }
        if(maximum==0){
            for (int i=0;i<n;i++){
                if(arr[i]%2==1){
                    maximum=1;
                    break;
                }
            }
        }
        System.out.println(maximum);
    }
}
