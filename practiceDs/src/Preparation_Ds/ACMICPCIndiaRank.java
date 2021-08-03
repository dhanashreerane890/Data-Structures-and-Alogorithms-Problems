package Preparation_Ds;

import java.util.Scanner;

public class ACMICPCIndiaRank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        String arr[]=new String[N];
        for(int i=0;i<N;i++){
            arr[i]= scanner.next();
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i].equals("India")){
                System.out.println(i+1);
            }
        }
    }
}
