package recursion;

import java.util.Scanner;

public class PowerOfNumber {

    static int power(int N,int R){
        if(R==0){
            return 1;
        }
        int val=power(N,R-1);
        return N*val;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N= scanner.nextInt();
        int R= scanner.nextInt();
        System.out.println(power(N,R));
    }
}
