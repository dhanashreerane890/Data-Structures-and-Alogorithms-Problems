package unit_2;

import java.util.Scanner;
public class OddSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        int sum =0;
        for(int i=0;i<=N;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
