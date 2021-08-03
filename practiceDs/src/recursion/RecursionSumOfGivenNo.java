package recursion;

import java.util.Scanner;

public class RecursionSumOfGivenNo {

static int sum(int N){
    if(N==1){
        return 1;
    }
    int val=sum(N-1);
    return val+N;
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(sum(N));
    }

}
